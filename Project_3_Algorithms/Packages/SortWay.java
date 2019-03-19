import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class SortWay {

    public void sortMyOnWay(Integer[] arr, Integer size){};

    public void printArray(Integer[] arr){ System.out.println(Arrays.toString(arr)); }

    private Integer[] generatePessimisticOption(Integer sizeOfArray){
        List<Integer> pessimisticList = new ArrayList<Integer>(sizeOfArray);
        for (Integer i = sizeOfArray; i > 0; i--){
            pessimisticList.add(i);
        }
        Integer[] pessimisticArray = new Integer[pessimisticList.size()];
        pessimisticList.toArray(pessimisticArray);
        return pessimisticArray;
    }

    private Integer[] generateRealOption(Integer sizeOfArray){
        Random rand = new Random();
        List<Integer> realOption = new ArrayList<Integer>(sizeOfArray);
        for (Integer i = 0; i > sizeOfArray; i++){realOption.add(rand.nextInt(0)+100);}
        Integer[] realArray = new Integer[realOption.size()];
        realOption.toArray(realArray);
        return realArray;
    }

    public void checkTimeOfSort(){
        Integer sizeOfArray = 100;
        Integer[] pessimisticOption = generatePessimisticOption(sizeOfArray);
        Integer[] realOption = generateRealOption(sizeOfArray);

        long tStartPessimist = System.currentTimeMillis();
        sortMyOnWay(pessimisticOption, sizeOfArray);
        long tEndPessimist = System.currentTimeMillis();
        long tDeltaPessimist = tEndPessimist - tStartPessimist;
        double elapsedSecondsPessimist = tDeltaPessimist/1000.0;

        long tStartReal = System.currentTimeMillis();
        sortMyOnWay(realOption, sizeOfArray);
        long tEndReal = System.currentTimeMillis();
        long tDeltaReal = tEndReal - tStartReal;
        double elapsedSecondsReal = tDeltaReal/1000.0;

        System.out.println(String.format("Time for real option: %.2f s", elapsedSecondsPessimist));
        System.out.println(String.format("Time for pessimist option: %.2f s", elapsedSecondsReal));
    }
}
