import jdk.jshell.spi.ExecutionControl;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void computeTriangle() {
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
        } while(!correctParametrs);

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
        } while(!correctParametrs);

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
        } while(!correctParametrs);

        Triangle myTriangle = new Triangle(side1, side2, side3);
        myTriangle.calculateArea();
        myTriangle.calculatePerimetr();
        myTriangle.print();
        return;
    }

    public static void computeSquare(){
        boolean correctParametrs = false;
        Scanner sc = new Scanner(System.in);
        double side = 0;

        do{
            System.out.println("Please enter a side");
            try {
                side = sc.nextDouble();
            } catch (InputMismatchException e1){
                System.out.println("Please enter a number");
                correctParametrs = false;
                continue;
            }
            correctParametrs = true;
        } while(!correctParametrs);

        Square mySquare = new Square(side);
        mySquare.calculateArea();
        mySquare.calculatePerimetr();
        mySquare.print();
        return;
    }

    public static void computeCircle(){
        boolean correctParametrs = false;
        Scanner sc = new Scanner(System.in);
        double radius = 0.0;

        do{
            System.out.println("Please enter a first side");
            try {
                radius = sc.nextDouble();
            } catch (InputMismatchException e1){
                System.out.println("Please enter a number");
                correctParametrs = false;
                continue;
            }
            correctParametrs = true;
        } while(!correctParametrs);

        Circle myCircle = new Circle(radius);
        myCircle.calculatePerimetr();
        myCircle.calculateArea();
        myCircle.print();
        return;
    }

    public static void main(String argv[]) {
        Scanner scanner = new Scanner(System.in);
        boolean loopVariable = false, mainLoop = false, endLoop = true;
        int userChoice = 0;

        do {
            do {
                System.out.println("Which a figure do you want to compute?");
                System.out.println("1. Triangle");
                System.out.println("2. Square");
                System.out.println("3. Circle");
                try {

                    userChoice = scanner.nextInt();
                    if (userChoice == 1 || userChoice == 2 || userChoice == 3) {
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (InputMismatchException e1) {
                    System.out.println("Please enter a number\n");
                    scanner.nextLine();
                } catch (IllegalArgumentException e2) {
                    System.out.println("Please enter a correct number\n");
                    scanner.nextLine();
                }
            } while (!loopVariable);

            switch (userChoice) {
                case 1: {
                    computeTriangle();
                    break;
                }
                case 2: {
                    computeSquare();
                    break;
                }
                case 3: {
                    computeCircle();
                    break;
                }
            }

            do {
                userChoice = 0;
                System.out.println("Do you want to compute anything else?");
                System.out.println("1. Yes");
                System.out.println("0. No");

                try {
                    userChoice = scanner.nextInt();
                    if (userChoice == 0 || userChoice == 1) {
                        if (userChoice == 0) {
                            mainLoop = false;
                        } else {
                            mainLoop = true;
                        }
                        endLoop = false;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException e1) {
                    System.out.println("Please enter a correct number\n");
                    scanner.nextLine();
                } catch (InputMismatchException e2) {
                    System.out.println("Please enter a number\n");
                    scanner.nextLine();
                }
            } while (endLoop);
        } while (mainLoop);
    }
}