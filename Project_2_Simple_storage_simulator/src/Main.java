import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String argv[]) {

        Item firstProduct = new Item("Apple", ItemCondition.NEW, 0.23, 5);
        firstProduct.print();
        FulfilmentCenter myFirstFulfilment = new FulfilmentCenter();
        Item secondProduct = new Item("Apple", ItemCondition.NEW, 0.23, 2);
        Item fourthProduct = new Item("Apple", ItemCondition.REFURBISHED, 0.23, 2);
        Item thirdProduct = new Item("Pineapple", ItemCondition.NEW, 0.24, 2);
        try {
            myFirstFulfilment.addProduct(firstProduct);
            myFirstFulfilment.addProduct(secondProduct);
            myFirstFulfilment.addProduct(fourthProduct);
            myFirstFulfilment.getProduct(thirdProduct);
            myFirstFulfilment.addProduct(thirdProduct);
            List<Item> testListOfItems1 = myFirstFulfilment.search("Apple");
            List<Item> testListOfItems2 = myFirstFulfilment.searchPartial("ppl");

        } catch (IllegalArgumentException err1) {
            System.err.println("If you add this product, the fulfillment will be overflowing");
        } catch (NullPointerException err2) {
            System.err.println("In storage are nothing!");
        } catch (NoSuchElementException err3){
            System.err.println("In fulfilment isn't found this product");
        }
    }
}
