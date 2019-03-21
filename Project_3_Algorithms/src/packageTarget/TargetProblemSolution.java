package packageTarget;

import javax.swing.text.html.HTMLDocument;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TargetProblemSolution {
    HashMap<Float, Integer> myIntegers = new HashMap<Float, Integer>();

    public void convertArray(float[] arr){
        if (arr.length == 0){throw new EmptyStackException(); }
        for (int i = 0; i < arr.length; i++){
            myIntegers.put(arr[i], i);
        }
    }

    public int[] solution(float[] array, float target){
        float diffrence = 0;
        int[] arrIndex = new int[2];
        boolean existedPair = false;
        if (array.length == 0) {throw new EmptyStackException();}
        Iterator it = myIntegers.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry myElement = (Map.Entry)it.next();
            diffrence = target - (float)myElement.getKey();
            if (!myIntegers.containsKey(diffrence)){
                it.remove();
                continue;
            } else {
                arrIndex[0] = (int) myElement.getValue();
                arrIndex[1] = myIntegers.get(diffrence);
               break;
            }
        }
        if (!existedPair){
            throw new IllegalArgumentException();
        }
        return arrIndex;
    }
}
