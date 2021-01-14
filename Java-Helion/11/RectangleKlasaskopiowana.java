public class Rectangle
{
    private double length;
    private double width;

    /**
     Konstruktor
     @param len D�ugo�� prostok�ta.
     @param w Szeroko�� prostok�ta.
     */

    public Rectangle(double len, double w)
    {
        length = len;
        width = w;
    }

    /**
     Metoda setLength zapisuje warto��
     w polu length.
     @param len Warto�� zapisywana w polu length.
     */

    public void setLength(double len)
    {
        length = len;
    }

    /**
     Metoda setWidth zapisuje warto��
     w polu width.
     @param w Warto�� zapisywana w polu width.
     */

    public void setWidth(double w)
    {
        width = w;
    }

    /**
     Metoda getLength zwraca d�ugo��
     obiektu typu Rectangle.
     @return Warto�� z pola length.
     */

    public double getLength()
    {
        return length;
    }

    /**
     Metoda getWidth zwraca szeroko��
     obiektu typu Rectangle.
     @return Warto�� z pola width.
     */

    public double getWidth()
    {
        return width;
    }

    /**
     Metoda getArea zwraca powierzchni�
     obiektu typu Rectangle.
     @return Iloczyn p�l length i width.
     */

    public double getArea()
    {
        return length * width;
    }
}
