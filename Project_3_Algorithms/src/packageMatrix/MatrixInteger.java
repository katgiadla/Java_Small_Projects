package packageMatrix;

import javax.swing.text.html.HTMLDocument;
import java.awt.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class MatrixInteger extends Matrix {
    int[][] myMatrix;

    public MatrixInteger(int newSize){
        size = newSize;
        myMatrix = new int[size][size];
    }
    public MatrixInteger(){
        size = 0;
        myMatrix = new int[size][size];
    }

    public void generateAMatrix(){
        Random rand = new Random();
        for (int i= 0; i < size; i++){
            for (int j = 0; i < size; i++){
                myMatrix[i][j] = rand.nextInt();
            }
        }
    }

    @Override
    public void print(){
        System.out.println(Arrays.toString(myMatrix));
    }

    public MatrixInteger addMatrixes(MatrixInteger anotherMatrix){
        this.generateAMatrix();
        if(anotherMatrix.size != size){throw new ArrayIndexOutOfBoundsException();}
        MatrixInteger result = new MatrixInteger(this.size);
        for (int i = 0; i < size; i++){
            for (int j = 0; i < size; i++){
                result.myMatrix[i][j] = anotherMatrix.myMatrix[i][j] + this.myMatrix[i][j];
            }
        }
        return result;
    }
}
