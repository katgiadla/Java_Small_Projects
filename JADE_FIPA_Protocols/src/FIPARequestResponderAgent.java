import jade.core.Agent;
import jade.core.AID;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.proto.AchieveREResponder;
import jade.domain.FIPANames;
import jade.domain.FIPAAgentManagement.NotUnderstoodException;
import jade.domain.FIPAAgentManagement.RefuseException;
import jade.domain.FIPAAgentManagement.FailureException;

/**
 This example shows how to implement the responder role in
 a FIPA-request interaction protocol. In this case in particular
 we use an <code>AchieveREResponder</code> ("Achieve Rational effect")
 to serve requests to perform actions from other agents. We use a
 random generator to simulate request refusals and action execution
 failures.
 @author Giovanni Caire - TILAB
 */
public class FIPARequestResponderAgent extends Agent {

    protected void setup() {
        System.out.println("Agent "+getLocalName()+" waiting for requests...");
        MessageTemplate template = MessageTemplate.and(
                MessageTemplate.MatchProtocol(FIPANames.InteractionProtocol.FIPA_REQUEST),
                MessageTemplate.MatchPerformative(ACLMessage.REQUEST) );
        addBehaviour(new AchieveREResponder(this, template) {
            protected ACLMessage prepareResponse(ACLMessage request) throws NotUnderstoodException, RefuseException {
                System.out.println("Agent "+getLocalName()+": REQUEST received from "+request.getSender().getName()+". Action is "+request.getContent());
                if (checkAction()) {
                    Integer value = Integer.parseInt(request.getContent());
                    if (value < 0){
                        System.out.println("Agent "+getLocalName()+": Refuse");
                        throw new RefuseException("check-failed");
                    }else{
                       Double valueToSend = Math.sqrt(value);
                       String toSend = valueToSend.toString();
                       System.out.println("My value of " + toSend.toString());
                    }
                    System.out.println("Agent "+getLocalName()+": Agree");
                    ACLMessage agree = request.createReply();
                    agree.setPerformative(ACLMessage.AGREE);
                    return agree;
                }
                else {
                    // We refuse to perform the action
                    System.out.println("Agent "+getLocalName()+": Refuse");
                    throw new RefuseException("check-failed");
                }
            }

            protected ACLMessage prepareResultNotification(ACLMessage request, ACLMessage response) throws FailureException {
                if (performAction()) {
                    System.out.println("Agent "+getLocalName()+": Action successfully performed");
                    ACLMessage inform = request.createReply();
                    inform.setPerformative(ACLMessage.INFORM);
                    return inform;
                }
                else {
                    System.out.println("Agent "+getLocalName()+": Action failed");
                    throw new FailureException("unexpected-error");
                }
            }
        } );
    }

    private boolean checkAction() {
        // Simulate a check by generating a random number
        return (Math.random() > 0.2);
    }

    private boolean performAction() {
        // Simulate action execution by generating a random number
        return (Math.random() > 0.2);
    }
}

