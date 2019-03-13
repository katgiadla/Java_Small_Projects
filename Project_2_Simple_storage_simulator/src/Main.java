public class Main {
    public static void main(String argv[]) {

        //Add new product to
        Item firstProduct = new Item("Apple", ItemCondition.NEW, 0.23, 10);
        firstProduct.print();
        FulfilmentCenter myFirstFulfilment = new FulfilmentCenter();
        Item secondProduct = new Item("Apple", ItemCondition.NEW, 0.23, 10);
        try {
            myFirstFulfilment.addProduct(firstProduct);
            myFirstFulfilment.addProduct(secondProduct);
        } catch (IllegalArgumentException err1) {
            System.err.println("If you add this product, the fulfillment will be overflowing");
        }
        System.out.println(firstProduct.equals(secondProduct));
    }
}
