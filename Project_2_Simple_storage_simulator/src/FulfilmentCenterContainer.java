import java.util.*;

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

    Map<String, FulfilmentCenter> findEmpty(){
        if (Fulfilment.isEmpty()){throw new NullPointerException();}
        Iterator<Map.Entry<String, FulfilmentCenter>> it = Fulfilment.entrySet().iterator();
        Map<String, FulfilmentCenter> emptyFulfilment = new HashMap<>();
        while(it.hasNext()){
            Map.Entry<String, FulfilmentCenter> entryFulfilment = it.next();
            if(entryFulfilment.getValue().maxCapacitance.equals(0)){
                emptyFulfilment.put(entryFulfilment.getKey(), entryFulfilment.getValue());
            }
        }
        if (emptyFulfilment.isEmpty()){throw new NullPointerException();}
        return emptyFulfilment;
    }

    void summary(){
        if (Fulfilment.isEmpty()){throw new NullPointerException();}
        Iterator<Map.Entry<String, FulfilmentCenter>> it = Fulfilment.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, FulfilmentCenter> entryFulfilment = it.next();
            System.out.println(String.format("Name: %s Fill %.1f proc.", entryFulfilment.getKey(), (entryFulfilment.getValue().howManyProductIHave()/entryFulfilment.getValue().maxCapacitance)*100));
        }
    }
}
