import jdk.jshell.spi.ExecutionControl;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public void computeTriangle(){
        boolean correctParametrs = false;
        Scanner sc = new Scanner(System.in);
        double side1 = 0, side2 = 0, side3 = 0;

        do{
            System.out.println("Please enter a first side");
            try {
                side1 = sc.nextDouble();
            } catch (InputMismatchException e1){
                System.out.println("Please enter a number");
                correctParametrs = false;
                continue;
            }
            correctParametrs = true;
        } while(correctParametrs);

        do{
            System.out.println("Please enter a second side");
            try {
                side2 = sc.nextDouble();
            } catch (InputMismatchException e1){
                System.out.println("Please enter a number");
                correctParametrs = false;
                continue;
            }
            correctParametrs = true;
        } while(correctParametrs);

        do{
            System.out.println("Please enter a third side");
            try {
                side3 = sc.nextDouble();
            } catch (InputMismatchException e1){
                System.out.println("Please enter a number");
                correctParametrs = false;
                continue;
            }
            correctParametrs = true;
        } while(correctParametrs);

        Triangle myTriangle = new Triangle(side1, side2, side3);
        myTriangle.calculateArea();
        myTriangle.calculatePerimetr();
        myTriangle.print();
        return;
    }

    public static void main(String argv[]){
        Scanner scanner = new Scanner(System.in);
        boolean loopVariable = false;
        int userChoice = 0;

        do {
            System.out.println("Which a figure do you want to compute?");
            System.out.println("1. Triangle");
            System.out.println("2. Square");
            System.out.println("3. Circle");
            try {

                userChoice = scanner.nextInt();
                if (userChoice == 1 || userChoice == 2 || userChoice == 3) {
                    break;
                }
                else{
                    throw new IllegalArgumentException();}
            } catch (InputMismatchException e1) {
                System.out.println("Please enter a number");
                scanner.nextLine();
            } catch (IllegalArgumentException e2){
                System.out.println("Please enter a correct number");
                scanner.nextLine();
            }
        } while (!loopVariable);


    }

}

