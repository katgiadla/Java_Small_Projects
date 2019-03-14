import java.util.HashMap;
import java.util.Map;

public class FulfilmentCenterContainer {
    Map<String, FulfilmentCenter> Fulfilment = new HashMap<>();

    void addCenter(String newNameFulfilment, Integer newMaxCapacitance){
        FulfilmentCenter tmpFulfilment = new FulfilmentCenter(newNameFulfilment, newMaxCapacitance);
        Fulfilment.put(newNameFulfilment, tmpFulfilment);
        System.out.println("The fulfilment has added correctly!");
    }

    void removeCenter(String nameToRemove){
        if (Fulfilment.isEmpty()) {throw new NullPointerException();}
        else{
            Fulfilment.remove(nameToRemove);
            System.out.println("The fulfilment has removed correctly!");
        }
    }
}
