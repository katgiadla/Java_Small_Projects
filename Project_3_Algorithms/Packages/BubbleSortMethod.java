public class BubbleSortMethod extends SortWay{

    @Override
    public void sortOnMyWay(Integer[] arr, Integer size) throws ZeroElementsException{
        System.out.print("Array before sort: ");
        printArray(arr);
        if (arr.length == 0) {throw new ZeroElementsException();}
        if (size == 1) {return;}
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > arr[i+1]){swap(arr[i], arr[i+1]);} }
        sortOnMyWay(arr, size-1);
        System.out.println("Array after bubble sort");
        printArray(arr);
        checkTimeOfSort();
    }
}
