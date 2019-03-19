import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String argv[]) {

        Item firstProduct = new Item("Apple", ItemCondition.NEW, 0.23, 5);
        firstProduct.print();
        FulfilmentCenter myFirstFulfilment = new FulfilmentCenter("firstFulment", 23);
        FulfilmentCenter mySecondFulfilment = new FulfilmentCenter("YourFulfilment", 21);
        FulfilmentCenterContainer myContainer = new FulfilmentCenterContainer();
        myContainer.addCenter(myFirstFulfilment.nameOfFillmentCenter, myFirstFulfilment.maxCapacitance);
        myContainer.addCenter(mySecondFulfilment.nameOfFillmentCenter, mySecondFulfilment.maxCapacitance);
        try {
            myFirstFulfilment.addProduct(firstProduct);
            myFirstFulfilment.countByCondition(ItemCondition.NEW);
        } catch (IllegalArgumentException err1) {
            System.err.println("If you add this product, the fulfillment will be overflowing!");
        } catch (NullPointerException err2) {
            System.err.println("In storage are nothing!");
        } catch (NoSuchElementException err3){
            System.err.println("In fulfilment isn't found this product!");
        }
    }
}
