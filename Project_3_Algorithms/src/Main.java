import packageSort.*;
import packageMatrix.*;
import packageSubstring.*;
import packageTarget.*;

public class Main {
    public static void main(String[] argv){
        Integer[] arr = {2,5, 5,6,8,3};
        BubbleSortMethod newBubbleSort = new BubbleSortMethod();
        try {
            newBubbleSort.sortOnMyWay(arr, arr.length);
        } catch (ZeroElementsException e){
            System.err.println("Zero elements in array!");
        }


    }
}
