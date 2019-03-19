public class GnomeSortMethod extends SortWay {
    @Override
    public void sortOnMyWay(Integer[] arr, Integer size) throws ZeroElementsException{
        Integer index = 0;
        if (arr.length == 0) {throw new ZeroElementsException();}
        System.out.print("Array before sort: ");
        printArray(arr);
        while (index<size){
            if(index == 0){index++;}
            if(arr[index] >= arr[index-1]){
                index++;} else{
                swap(arr[index], arr[index-1]);
                index--;
            }
        }
        System.out.println("Array after bubble sort");
        printArray(arr);
        checkTimeOfSort();
    }
}
