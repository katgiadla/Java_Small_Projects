import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FullFillmentCenter implements Print {
    String nameOfFillment;
    List<Item> listOfProducts = new ArrayList<>(); //interface
    Integer maxCapacitance = 10;

    public void addProduct(Item newItem){ }

    public void getProduct(Item itemToGet){}

    public void removeProduct(Item itemToRemove) {}

    public void search(String nameofProduct){}

    public void searchPartial(String searchName){}

    public void countByCondition(ItemCondition conditionToDisplay){}

    @Override
    public void print() {}

}
