import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.ThreadedBehaviourFactory;

import java.util.concurrent.ThreadFactory;

public class klasa_4_2 extends Agent {
    private ThreadedBehaviourFactory tbf = new ThreadedBehaviourFactory();

    @Override
    protected void setup() {
        Behaviour c1 = new CyclicBehaviour() {
            @Override
            public void action() {
                System.out.println("cyclic1");
            }
        };

        Behaviour c2 = new CyclicBehaviour() {
            @Override
            public void action() {
                System.out.println("cyclic2");
            }
        };
        addBehaviour(tbf.wrap(c1));
        addBehaviour(tbf.wrap(c2));
    }
}
