package packageMatrix;

import java.util.Arrays;
import java.util.Random;

public class MatrixString extends Matrix{
    String[][] myMatrix;

    public MatrixString(int newSize){
        size=newSize;
        myMatrix = new String[size][size];
    }
    public MatrixString(){
        size = 0;
        myMatrix = new String[size][size];
    }

    public void generateMyMatrix(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
    }

    @Override
    public void print(){
        System.out.println(Arrays.toString(myMatrix));
    }

    public MatrixString addMatrixes(MatrixString anotherMatrix){
        this.generateMyMatrix();
        if(anotherMatrix.size != size){throw new ArrayIndexOutOfBoundsException();}
        MatrixString result = new MatrixString(this.size);
        for (int i = 0; i < size; i++){
            for (int j = 0; i < size; i++){
                result.myMatrix[i][j] = anotherMatrix.myMatrix[i][j] + this.myMatrix[i][j];
            }
        }
        return result;
    }
}
