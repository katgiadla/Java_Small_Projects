import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class AgWys extends Agent {

    protected void setup() {
        addBehaviour(new TwoSteps());
    }

    class TwoSteps extends Behaviour {
        private int step = 1;

        public void action() {
            switch (step) {
                case 1:
                    ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
                    msg.addReceiver(new AID("ToMe", AID.ISLOCALNAME));
                    msg.setContent("All of me");
                    send(msg);
                case 2:
                    ACLMessage msgRec = myAgent.receive();
                    if(msgRec == null){
                        System.out.println("I have not any message!");
                        block();
                        //doDelete();
                        //step++;
                    } else {
                        System.out.println(msgRec.getContent());
                        doDelete();
                    }
            }
            step++;
        }

        public boolean done() {
            return step == 3;
        }

        public int onEnd() {
            myAgent.doDelete();
            return super.onEnd();
        }
    }

    protected void takeDown() {
        System.out.println("Agent "+getLocalName()+": terminating");
    }
}
