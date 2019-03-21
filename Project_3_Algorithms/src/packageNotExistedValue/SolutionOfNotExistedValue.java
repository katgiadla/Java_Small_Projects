package packageNotExistedValue;

import java.util.List;

public class SolutionOfNotExistedValue{
    public int solution(List<Integer> a) throws TooBigArrayException, EmptyArrayException{
        if (a.size() > 100000) {throw new TooBigArrayException("Your array ist too big!");}
        if (a.isEmpty()) {throw new EmptyArrayException("Your array is empty!");}

        for (Integer it: a){
            if(it > 1000000 || it < -1000000){ a.remove(it); }
        }

        int foundValue = 1;
        boolean isFound = true;
        Integer i = 0;
        while(isFound){
            if(a.contains(i)){
                i++;
            } else {
                isFound = false;
                foundValue = i;
                break;
            }
        }
        return foundValue;
    }
}