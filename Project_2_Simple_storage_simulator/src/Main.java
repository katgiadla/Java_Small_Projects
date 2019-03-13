import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String argv[]) {

        //Add new product to
        Item firstProduct = new Item("Apple", ItemCondition.NEW, 0.23, 5);
        firstProduct.print();
        FulfilmentCenter myFirstFulfilment = new FulfilmentCenter();
        Item secondProduct = new Item("Apple", ItemCondition.NEW, 0.23, 2);
        Item thirdProduct = new Item("Pineapple", ItemCondition.NEW, 0.24, 2);
        try {
            myFirstFulfilment.addProduct(firstProduct);
            myFirstFulfilment.addProduct(secondProduct);
            myFirstFulfilment.getProduct(thirdProduct);
            myFirstFulfilment.addProduct(thirdProduct);
            List<Item> newItemList = myFirstFulfilment.search("Apfel");

        } catch (IllegalArgumentException err1) {
            System.err.println("If you add this product, the fulfillment will be overflowing");
        } catch (NullPointerException err2) {
            System.err.println("In storage are nothing!");
        } catch (NoSuchElementException err3){
            System.err.println("In fulfilment isn't found this product");
        }
    }
}
