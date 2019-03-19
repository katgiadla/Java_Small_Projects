import java.util.Comparator;

public class ToSortReversedByAmount implements Comparator<Item> {
    @Override
    public int compare(Item i1, Item i2){
        return i1.amount - i2.amount;
    }
}