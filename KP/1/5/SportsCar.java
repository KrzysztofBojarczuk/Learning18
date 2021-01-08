public class SportsCar
{
    private CarType make;
    private CarColor color;
    private double price;

    public SportsCar(CarType aMake, CarColor aColor, double aPrice)
    {
        make = aMake;
        color = aColor;
        price = aPrice;
    }

    public CarType getMake()
    {
        return make;
    }
    public CarColor getColor()
    {
        return color;
    }
    public double getPrice()
    {
        return price;
    }
    public String toString()
    {
        String str = String.format("Marka: %s\nKolor: %s\nCena: %,.2f złotych", make, color, price);
        return str;
    }
}
