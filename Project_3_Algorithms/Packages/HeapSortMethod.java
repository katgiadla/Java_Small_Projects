public class HeapSortMethod extends SortWay{
    private void heapify(Integer[] arr, Integer size, Integer node){
        Integer largest = node;
        Integer left = 2 * node  + 1;
        Integer right = 2 * node + 2;
        if(left < size && arr[left] > arr[largest]){largest = left;}
        if(right < size && arr[right] > arr[largest]){largest = right;}
        if(largest!=node){
            swap(arr[node], arr[largest]);
            heapify(arr, size, largest);
        }
    }

    @Override
    public void sortOnMyWay(Integer[] arr, Integer size){
        System.out.print("Array before sort: ");
        printArray(arr);
        for(Integer i = (size/2) - 1; i>=0; i++){ heapify(arr, size, i); }
        for(Integer i = size - 1; i>=0; i--){
            swap(arr[0], arr[i]);
            heapify(arr, i, 0);
        }
        System.out.println("Array after bubble sort");
        printArray(arr);
        checkTimeOfSort();
    }
}
