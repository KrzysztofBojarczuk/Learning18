enum Apple {Jonathan, GoldenDel, RedDel, Winesap, Cortland}

public class EnumDemo
{
    public static void main(String[] args) {

        Apple ap;

        ap = Apple.RedDel;

        System.out.println("Wartość ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        if(ap == Apple.GoldenDel)
            System.out.println("ap zawiera GoldenDel.\n");

        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan jest czerowne.");
                break;
            case GoldenDel:
                System.out.println("Golden Delicious jest żółty.");
                break;
            case RedDel:
                System.out.println("Red Delicious jest czerwone.");
            case Winesap:
                System.out.println("Winesap jest czerwone.");
            case Cortland:
                System.out.println("Cortland jest czerwone.");
                break;
        }
    }
}
