import java.util.Locale;

public class Triangle extends Figure implements Print{
    public double Area, Parimeter;
    public double Sides[] = new double[3];

    public Triangle(double newSide1, double newSide2, double newSide3) {
        this.Sides[0] = newSide1;
        this.Sides[1] = newSide2;
        this.Sides[2] = newSide3;
    }


    @Override
    public double calculatePerimeter() {
        this.Parimeter = this.Sides[0] + this.Sides[1] + this.Sides[2];
        return this.Parimeter;
    }

    @Override
    public double calculateArea() {
        double halfParimeter = (this.Sides[0] + this.Sides[1] + this.Sides[2])/2;
        this.Area = halfParimeter * (halfParimeter-this.Sides[0]) * (halfParimeter-this.Sides[1]) * (halfParimeter-this.Sides[2]);
        this.Area = Math.sqrt(this.Area);
        return this.Area;
    }

    @Override
    public void print() {
        System.out.println("It's triangle");
        System.out.println(String.format(Locale.US, "Side 1: %.2f, Side 2: %.2f, Side3: %.2f", this.Sides[0], this.Sides[1], this.Sides[2]));
        System.out.println(String.format(Locale.US, "Parimeter: %.2f", this.Parimeter));
        System.out.println(String.format(Locale.US, "Area: %.2f", this.Area));
        return;
    }
}
