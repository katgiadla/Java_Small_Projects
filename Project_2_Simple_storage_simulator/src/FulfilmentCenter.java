import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.IntStream;

public class FulfilmentCenter {
    String nameOfFillmentCenter;
    List<Item> listOfProducts = new ArrayList<>(); //interface
    Integer maxCapacitance = 15;

    void addProduct(Item newItem) {
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

    void getProduct(Item whichItem){
        if (listOfProducts.isEmpty()){
            System.err.println("This fulfilment is empty. Any product has removed");
            return;
        }else {
            for (Item iterator : listOfProducts) {
                if (iterator.name.compareToIgnoreCase(iterator.name) == 0) {
                    if (iterator.amount - whichItem.amount <= 0){
                        listOfProducts.remove(iterator);
                        System.out.println("The product has been removed correctly!");
                        return;
                    } else {
                        iterator.amount = iterator.amount - whichItem.amount;
                        System.out.println("Amount of this product has been correctly reduced!");
                        return;
                    }
                }
            }
        }
    }
}
