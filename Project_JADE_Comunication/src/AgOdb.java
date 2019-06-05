import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class AgOdb extends Agent {

    protected void setup() {
        addBehaviour(new receivingMessage());
    }

   class receivingMessage extends CyclicBehaviour{
        public void action(){
            ACLMessage msg = myAgent.receive();
            if(msg == null){
                System.out.println("I have not any message!");
                block();
            } else{
                if(msg.getPerformative() == ACLMessage.REQUEST){
                    System.out.println(msg.getContent());
                    ACLMessage reply = msg.createReply();
                    reply.setPerformative(ACLMessage.INFORM);
                    reply.setContent("Wykonałem!");
                    send(reply);
                } else{
                    ACLMessage reply = msg.createReply();
                    reply.setPerformative(ACLMessage.NOT_UNDERSTOOD);
                    reply.setContent("Przepraszam, nie rozumiem!");
                    //System.out.println("Nie wiem o co chodzi");
                    send(reply);
                }
            }
        }
   }

    protected void takeDown() {
        System.out.println("Agent "+getLocalName()+": terminating");
    }
}
