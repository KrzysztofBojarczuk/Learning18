enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland;}

public class EnumDemo
{
    public static void main(String[] args) {

        Apple ap, ap2, ap3;

        System.out.println("Oto wszystkie stałe wyliczenia" + " oraz ich wartośc liczbowe: ");

        for(Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal());

        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;

        System.out.println();

        if(ap.compareTo(ap2) < 0)
            System.out.println(ap + " znajduje się przed " + ap2);

        if(ap.compareTo(ap2) < 0)
            System.out.println(ap2 + " znajduje się przed " + ap);

        if(ap.compareTo(ap3) == 0)
            System.out.println(ap + " znajduje się przed " + ap3);

        System.out.println();

        if(ap.equals(ap2))
            System.out.println("Błąd!");

        if(ap.equals(ap3))
            System.out.println(ap + " jest równe " + ap3);

        if(ap == ap3)
            System.out.println(ap + " == " + ap3);
    }
}
