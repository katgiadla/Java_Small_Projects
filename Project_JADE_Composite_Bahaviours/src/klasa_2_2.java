import jade.core.Agent;
import jade.core.behaviours.*;

/**
 This example shows the usage of the <code>FSMBehavior</code> that allows
 composing behaviours according to a Finite State Machine.<br>
 @author Giovanni Caire - TILAB
 */
public class klasa_2_2 extends Agent {

    protected void setup() {
        Behaviour task = new ThreeSteps();
        Behaviour task1 = new ThreeSteps();
        Behaviour task2 = new ThreeSteps();
        ParallelBehaviour pb = new ParallelBehaviour(this, ParallelBehaviour.WHEN_ANY);
        addBehaviour(pb);
        pb.addSubBehaviour(task);
        pb.addSubBehaviour(task1);
        pb.addSubBehaviour(task2);
    }

    class ThreeSteps extends Behaviour {
        private int step = 1;

        public void action() {
            switch (step) {
                case 1:
                    System.out.println("Krok" + step);
                    break;
                case 2:
                    System.out.println("Krok " + step);
                    break;
                case 3:
                    System.out.println("Krok " + step);
                    break;

            }
            step++;
        }

        public boolean done() {
            return step == 4;
        }

        public int onEnd() {
            myAgent.doDelete();
            return super.onEnd();
        }
    }}

