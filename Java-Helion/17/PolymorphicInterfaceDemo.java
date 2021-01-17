public class PolymorphicInterfaceDemo
{
    public static void main(String[] args) {

        CompactDisc cd = new CompactDisc("Greatest Hits", "Joe Looney Band", 18.95);

        DvdMovie movie = new DvdMovie("Wheels of Fury", 137, 12.95);

        System.out.println("Produkt numer1: " + cd.getTitle());

        showPrice(cd);

        System.out.println("Produkt numer 2: " + movie.getTitle());

        showPrice(movie);
    }

    private static void showPrice(Retailltem item)
    {
        System.out.printf("Cena: %,.2f złotego\n", item.getRetailPrice());
    }
}
