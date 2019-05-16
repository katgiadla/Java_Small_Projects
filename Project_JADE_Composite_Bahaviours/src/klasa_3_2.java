import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.SequentialBehaviour;
import jade.core.behaviours.Behaviour;

public class klasa_3_2 extends Agent {
    protected void setup() {
        SequentialBehaviour myBehaviour1 = new SequentialBehaviour(this);
        Behaviour task1 = new ThreeSteps();
        Behaviour task2 = new ThreeSteps();
        Behaviour task3 = new ThreeSteps();
        myBehaviour1.addSubBehaviour(task1);
        myBehaviour1.addSubBehaviour(task2);
        myBehaviour1.addSubBehaviour(task3);
        addBehaviour(myBehaviour1);
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
        return super.onEnd();
    }
}}
