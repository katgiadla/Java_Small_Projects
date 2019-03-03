import java.util.Scanner;

public class Main {
    public static void main(String argv[]){
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        boolean loopVariable = true;

        while (loopVariable == true) {
            System.out.println("Which a figure do you want to compute?");
            System.out.println("1. Triangle");
            System.out.println("2. Square");
            System.out.println("3. Circle");
            try {
                userChoice = scanner.nextInt();
            } catch (IllegalArgumentException e) {
                System.out.println("Please, entry a number");
                loopVariable = true;
            }
        }
        boolean correctParametrs = false;
        switch (userChoice){
            case 1: {
                double side1 = 0, side2 = 0, side3 = 0;
                while (!correctParametrs) {
                    try{
                        side1 = scanner.nextDouble();
                        side2 = scanner.nextDouble();
                        side3 = scanner.nextDouble();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Please enter a number in double's format");
                        correctParametrs = false;
                    }
                }
                Triangle myTriangle = new Triangle(side1, side2, side3);
                myTriangle.calculateArea();
                myTriangle.calculatePerimetr();
                myTriangle.print();
                break;}

                case 2:
                    double side = 0;
                    while (!correctParametrs){
                        try{
                            side = scanner.nextDouble();
                        } catch (IllegalArgumentException e){
                            System.out.println("Please, enter a number in double's format");
                            correctParametrs = false;
                        }
                    }
                    Square mySquare = new Square(side);
                    mySquare.calculateArea();
                    mySquare.calculatePerimetr();
                    mySquare.print();
                    break;
                case 3:
                    double radius = 0;
                    while (!correctParametrs) {
                        try{
                            radius = scanner.nextDouble();
                        } catch (IllegalArgumentException e){
                            System.out.println("Please, enter a number in double's format");
                            correctParametrs = false;
                        }
                    }

                    Circle myCircle = new Circle(radius);
                    myCircle.calculateArea();
                    myCircle.calculatePerimetr();
                    myCircle.print();
                    break;
                 default:
                     System.out.println("Please choose 1, 2 or 3");

        }

    }
}
