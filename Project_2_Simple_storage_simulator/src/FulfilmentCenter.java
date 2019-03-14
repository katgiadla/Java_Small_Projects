import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.*;
import java.util.stream.IntStream;

public class FulfilmentCenter implements Comparator<Item>{
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
                    if (iterator.condition.equals(newItem.condition)){
                        System.out.println("Existed product has added correctly!");
                        iterator.amount += newItem.amount;
                        return;
                    }
            }
        }
        System.out.println("New product has added correctly!");
        listOfProducts.add(newItem);
    }

    void getProduct(Item whichItem) {
        if (listOfProducts.isEmpty()){
            throw new NullPointerException();
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

    void removeProduct(Item whichItem){
        if (listOfProducts.isEmpty()){
            throw new NullPointerException();
        } else {
            for (Item iterator: listOfProducts){
                if (iterator.name.compareToIgnoreCase(whichItem.name) == 0){
                    listOfProducts.remove(iterator);
                    System.out.println("Product has been correctly removed!");
                    return;
                }
            }
            throw new NoSuchElementException();
        }
    }

    @Override
    public int compare(Item i1, Item i2){
        return i1.name.compareTo(i2.name);
    }

    Integer countByCondition(ItemCondition conditionToSummary){
        if (listOfProducts.isEmpty()){ throw new NullPointerException(); }
        Integer howManyProducts = 0;
        for (Item iterator: listOfProducts){
            if (iterator.condition.equals(conditionToSummary)){ howManyProducts += iterator.amount; }
        }
        System.out.println(String.format("Count of products: %d", howManyProducts));
        return howManyProducts;
    }

    List<Item> search(String nameToSearch){
        if (listOfProducts.isEmpty()){ throw new NullPointerException(); }
        Item myTmpItem = new Item(nameToSearch);
        List<Item> myTmpListOfItem = new ArrayList<>();
        for (Item iterator: listOfProducts){
            if(compare(myTmpItem, iterator) == 0){
                System.out.println("I found a product!");
                iterator.print();
                myTmpListOfItem.add(iterator);
            }
        }
        if (myTmpListOfItem.isEmpty()){throw new NoSuchElementException();}
        else
            return myTmpListOfItem;
    }

    List<Item> searchPartial(String nameToSearch){
        if (listOfProducts.isEmpty()){ throw new NullPointerException(); }
        List<Item> myTmpListOfItem = new ArrayList<>();
        for(Item iterator: listOfProducts){
            if(iterator.name.contains(nameToSearch)){
                System.out.println("I found a products!");
                iterator.print();
                myTmpListOfItem.add(iterator);
            }
        }
        if (myTmpListOfItem.isEmpty()){throw new NoSuchElementException();}
        else
            return myTmpListOfItem;
    }

    void summary(){
        if (listOfProducts.isEmpty()){ throw new NullPointerException();}
        for (Item iterator: listOfProducts) { iterator.print(); }
    }

    void sortByName(){
        if (listOfProducts.isEmpty()){ throw new NullPointerException(); }
        Collections.sort(listOfProducts, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o1.name.compareToIgnoreCase(o2.name);
            }
            });
    }

    void sortByAmount(){
        if (listOfProducts.isEmpty()){ throw new NullPointerException(); }
        Comparator toReverseOrdered = Collections.reverseOrder(new ToSortReversedByAmount());
        Collections.sort(listOfProducts, toReverseOrdered);
    }

    Item max(){
        if (listOfProducts.isEmpty()){ throw new NullPointerException(); }
        Item maxOfAmountProduct = Collections.max(listOfProducts, (i1, i2) -> {
            return Integer.compare(i1.amount, i2.amount);
        });
        return maxOfAmountProduct;
    }
}
