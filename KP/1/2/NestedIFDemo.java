public class NestedIFDemo
{
    public static void main(String[] args) {

        A.NestedIF nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("Liczba 10 nie jest ujemna ");
        if(nif.isNotNegative(-12))
            System.out.println("to nie zostanie wyświetlone");
    }
}
