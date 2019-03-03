import java.lang.Math.*;
import java.util.Locale;

public class Square extends Figure implements Print{
    double Side;
    double Area, Parimeter;

    Square(double newSide){
        this.Side = newSide;
    }

    @Override
    public double calculatePerimetr() {
        this.Parimeter = 4 * this.Side;
        return this.Parimeter;
    }

    @Override
    public double calculateArea() {
        this.Area = Math.pow(this.Side, 2);
        return this.Area;
    }

    @Override
    public void print() {
        System.out.println("It's a square.");
        System.out.println(String.format(Locale.US, "Side: %.2f", this.Side));
        System.out.println(String.format(Locale.US, "Parimeter: %.2f", this.Parimeter));
        System.out.println(String.format(Locale.US, "Area: %.2f", this.Area));
    }
}
