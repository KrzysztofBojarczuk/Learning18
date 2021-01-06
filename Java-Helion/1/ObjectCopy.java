public class ObjectCopy
{
    public static void main(String[] args) {

        Stock company1 = new Stock("XYZ", 9.62);
        Stock company2;

        company2 = company1.copy();

        System.out.println("Firma 1:\n" + company1);
        System.out.println();
        System.out.println("Firma 2:\n" + company2);

        if (company1 == company2)
        {
            System.out.println("Zmienne company1 i company2 " + "wskazuje ten sam obiekt.");
        }
        else
        {
            System.out.println("Zmienne company1 i company2 " + "wskazuje róźne obiekty.");
        }
    }
}
