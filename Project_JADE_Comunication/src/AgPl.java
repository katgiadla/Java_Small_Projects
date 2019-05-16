import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class AgPl extends Agent {

    protected void setup() {
        addBehaviour(new SearchPolish());
    }

    class SearchPolish extends CyclicBehaviour{
        public void action(){
            MessageTemplate mt = MessageTemplate.MatchLanguage("polski");
            ACLMessage msg = myAgent.receive(mt);
            if(msg == null){
                System.out.println("I have not any message!");
                block();
                //doDelete();
            }else{
            if(!mt.match(msg)){
                System.out.println("It's not polish");
                block();
            } else{
                System.out.println(msg.getContent());
            }
        }
    }}

    protected void takeDown() {
        System.out.println("Agent "+getLocalName()+": terminating");
    }
}