import java.lang.Math.*;
import java.util.Locale;

public class Circle extends Figure implements Print {
    double Radius;
    double Area, Parimeter;

    Circle(double newRadius){
        this.Radius = newRadius;
    }

    @Override
    public double calculatePerimetr() {
        this.Parimeter = 2 * Math.PI * this.Radius;
        return this.Parimeter;
    }

    @Override
    public double calculateArea() {
        this.Area = Math.PI * Math.pow(this.Radius, 2);
        return this.Area;
    }

    @Override
    public void print() {
        System.out.println("It's a circle.");
        System.out.println(String.format(Locale.US, "Radius: %.2f", this.Radius));
        System.out.println(String.format(Locale.US, "Parimeter: %.2f", this.Parimeter));
        System.out.println(String.format(Locale.US, "Area: %.2f", this.Area));
    }
}
