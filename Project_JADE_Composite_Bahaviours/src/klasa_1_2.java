import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.FSMBehaviour;

/**
 This example shows the usage of the <code>FSMBehavior</code> that allows
 composing behaviours according to a Finite State Machine.<br>
 @author Giovanni Caire - TILAB
 */
public class klasa_1_2 extends Agent {
    // State names
    private static final String STATE_A = "A";
    private static final String STATE_B = "B";
    private static final String STATE_C = "C";
    private static final String STATE_D = "D";
    private static final String STATE_E = "E";

    protected void setup() {
        FSMBehaviour fsm = new FSMBehaviour(this) {
            public int onEnd() {
                System.out.println("FSM behaviour completed.");
                myAgent.doDelete();
                return super.onEnd();
            }
        };

        // Register state A (first state)
        fsm.registerFirstState(new NamePrinter(), STATE_A);

        // Register state B
        fsm.registerState(new RandomGenerator(2) ,STATE_B);

        // Register state C
        fsm.registerState(new NamePrinter(), STATE_C);

        // Register state D
        fsm.registerState(new RandomGenerator(2), STATE_D);

        // Register state F (final state)
        fsm.registerLastState(new NamePrinter(), STATE_E);

        // Register the transitions
        fsm.registerDefaultTransition(STATE_A, STATE_B);
        fsm.registerTransition(STATE_B, STATE_D, 0);
        fsm.registerTransition(STATE_B, STATE_C, 1);
        fsm.registerDefaultTransition(STATE_C, STATE_D);
        fsm.registerTransition(STATE_D, STATE_A, 1);
        fsm.registerTransition(STATE_D, STATE_E, 0);

        addBehaviour(fsm);
    }

    /**
     Inner class NamePrinter.
     This behaviour just prints its name
     */
    private class NamePrinter extends OneShotBehaviour {
        public void action() {
            System.out.println("Executing behaviour "+getBehaviourName());
        }
    }

    /**
     Inner class RandomGenerator.
     This behaviour prints its name and exits with a random value
     between 0 and a given integer value
     */
    private class RandomGenerator extends NamePrinter {
        private int maxExitValue;
        private int exitValue;

        private RandomGenerator(int max) {
            super();
            maxExitValue = max;
        }

        public void action() {
            System.out.println("Executing behaviour "+getBehaviourName());
            exitValue = (int) (Math.random() * maxExitValue);
            System.out.println("Exit value is "+exitValue);
        }

        public int onEnd() {
            return exitValue;
        }
    }
}
