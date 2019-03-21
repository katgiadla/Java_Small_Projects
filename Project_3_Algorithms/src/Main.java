import packageSort.*;
import packageMatrix.*;
import packageSubstring.*;
import packageTarget.*;
import packageNotExistedValue.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] argv){
        Integer[] arr = {2,5, 5,6,8,3};
        float[] arrayToTarget = {2, 4, 3, 2};
        String firstString = "abcd";
        String secondString = "cdabcdlk";
        List<Integer> listToTestSolution = new ArrayList<>();
        listToTestSolution.add(4);
        listToTestSolution.add(5);
        listToTestSolution.add(34);
        listToTestSolution.add(-5);
        listToTestSolution.add(1);

        BubbleSortMethod newBubbleSort = new BubbleSortMethod();
        try {
            newBubbleSort.sortOnMyWay(arr, arr.length);
        } catch (ZeroElementsException e){
            System.err.println("Zero elements in array!");
        }

        List<MatrixInteger> matrixList= new ArrayList<MatrixInteger>();
        matrixList.add(new MatrixInteger(4));
        matrixList.add(new MatrixInteger(4));
        for(MatrixInteger it: matrixList){ it.print(); }
        MatrixInteger matrix3 = matrixList.get(0).addMatrixes(matrixList.get(1));
        matrixList.add(matrix3);

        SearchSubstring newSearcher = new SearchSubstring();
        newSearcher.substring(firstString, secondString);

        List<MatrixString> matrixStringList = new ArrayList<MatrixString>();
        matrixStringList.add(new MatrixString(4));
        matrixStringList.add(new MatrixString(4));
        for(MatrixString it: matrixStringList){ it.print(); }
        MatrixString matrix5 = matrixStringList.get(0).addMatrixes(matrixStringList.get(1));
        matrixStringList.add(matrix5);

        TargetProblemSolution newSolution = new TargetProblemSolution();
        newSolution.convertArray(arrayToTarget);

        SolutionOfNotExistedValue newFoundNumber = new SolutionOfNotExistedValue();
        try{
        newFoundNumber.solution(listToTestSolution);
        } catch (EmptyArrayException e){
            System.err.println("Your Array is empty!");
        } catch (TooBigArrayException e){
            System.err.println("Your array is too big!"); }
    }
}
