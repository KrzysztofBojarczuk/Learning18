enum Apple {Jonathan, GoldenDel, RedDel, Winesap, Cortland}

public class EnumDemo
{
    public static void main(String[] args) {

        Apple ap;

        System.out.println("Oto wszystkie stałe wyliczenia Apple:");

        Apple allapples[] = Apple.values();
        for(Apple a : allapples)
            System.out.println(a);

        System.out.println();

        ap = Apple.valueOf("Winesap");
        System.out.println("ap zawiera " + ap);
        
    }
}
