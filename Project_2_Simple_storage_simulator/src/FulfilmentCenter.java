import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.IntStream;

public class FulfilmentCenter {
    String nameOfFillmentCenter;
    List<Item> listOfProducts = new ArrayList<>(); //interface
    Integer maxCapacitance = 15;

    public void addProduct(Item newItem){
        Integer currentAmountOfProducts = 0;
        for (Item iterator: listOfProducts){ currentAmountOfProducts += iterator.amount;}
        if (currentAmountOfProducts + newItem.amount > maxCapacitance){
            throw new IllegalArgumentException();
        }
        for(Item iterator: listOfProducts){
            if (iterator.name.compareToIgnoreCase(newItem.name) == 0){
                    System.out.println("Old product has added correctly!");
                    iterator.amount += newItem.amount;
                    return;
            }
        }
        System.out.println("New product has added correctly!");
        listOfProducts.add(newItem);
    }
}
