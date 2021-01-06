public class Rectangle extends Figure
{
    Rectangle(double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Wewnątrz metody area() z Rectange.");
        return dim1 * dim2;
    }
}
