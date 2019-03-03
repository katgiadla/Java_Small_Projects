import java.util.Locale;
import static java.lang.Math.*;

public class Triangle extends Figure implements Print{
    public double Side1, Side2, Side3;
    public double Area, Parimeter;

    public Triangle(double newSide1, double newSide2, double newSide3) {
        this.Side1 = newSide1;
        this.Side2 = newSide2;
        this.Side3 = newSide3;
    }

    @Override
    public double calculatePerimeter() {
        this.Parimeter = this.Side1 + this.Side2 + this.Side3;
        return this.Parimeter;
    }

    @Override
    public double calculateArea() {
        double halfParimeter = (this.Side1 + this.Side2 + this.Side3)/2;
        this.Area = halfParimeter * (halfParimeter-this.Side1) * (halfParimeter-this.Side2) * (halfParimeter-this.Side3);
        this.Area = Math.sqrt(this.Area);
        return this.Area;
    }

    @Override
    public void print() {
        System.out.println("It's triangle");
        System.out.println(String.format(Locale.US, "Side 1: %.2f, Side 2: %.2f, Side3: %.2f", this.Side1, this.Side2, this.Side3 ));
        System.out.println(String.format(Locale.US, "Parimeter: %.2f", this.Parimeter));
        System.out.println(String.format(Locale.US, "Area: %.2f", this.Area));
        return;
    }
}
