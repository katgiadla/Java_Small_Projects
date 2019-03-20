package packageSort;

public class PancakeSortMethod extends SortWay {
    private void flip(Integer[] arr, Integer i){
        Integer tmp, start = 0;
        while(start < i){
            tmp = arr[start];
            arr[start] = arr[i];
            arr[i] = tmp;
            start++;
            i--;
        }
    }

    private Integer findIndexOfMaxValue(Integer[] arr, Integer size){
        Integer indexOfMax, i;
        for (indexOfMax = 0, i = 0; i < size; ++i){
            if(arr[i] > arr[indexOfMax]) {indexOfMax = i;}
        }
        return indexOfMax;
    }

    @Override
    public void sortOnMyWay(Integer[] arr, Integer size) throws ZeroElementsException{
        if (arr.length == 0) {throw new ZeroElementsException();}
        System.out.print("Array before sort: ");
        printArray(arr);
        for (Integer currentSize = size; currentSize > 1; --currentSize){
            int indexMaxValue = findIndexOfMaxValue(arr, currentSize);
            if(indexMaxValue != currentSize-1){
                flip(arr, indexMaxValue);
                flip(arr, currentSize-1);
            }
        }
        System.out.println("Array after pancake sort: ");
        printArray(arr);
        checkTimeOfSort();
    }
}
