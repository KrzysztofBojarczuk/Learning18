public class Triangle extends Figure
{
    Triangle(double a, double b)
    {
        super(a, b);
    }
    double area()
    {
        System.out.println("Wewnątrz metody area() z Triangle");
        return dim1 * dim2 / 2;
    }
}
