public class ShellSortMethod extends SortWay {
    @Override
    public void sortOnMyWay(Integer[] arr, Integer size){
        Integer tmp, j;
        System.out.print("Array before sort: ");
        printArray(arr);
        for (Integer gap = size/2; gap > 0; gap /= 2){
            for (Integer i = gap; i<size; i += 1){
                tmp = arr[i];
                for(j = i; j >= gap && arr[j - gap] > tmp; j -= gap){arr[j] = arr[j-gap];}
                arr[j] = tmp;
            }
        }
        System.out.println("Array after bubble sort");
        printArray(arr);
        checkTimeOfSort();
    }
}
