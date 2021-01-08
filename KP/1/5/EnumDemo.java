public class EnumDemo {

    enum Day { NIEDZIELA, PONIEDZIALEK, WTOREK, SRODA, CZWARTEK, PIATEK, SOBOTA}

    public static void main(String[] args) {
        Day workDay = Day.SRODA;

        System.out.println(workDay);

        System.out.println("Numer porządkowy wartość " + Day.NIEDZIELA + " to " + Day.NIEDZIELA.ordinal() + ".");

        System.out.println("Numer porządkowy wartość " + Day.SOBOTA + " to " + Day.SOBOTA.ordinal() + ".");

        if (Day.PIATEK.compareTo(Day.PONIEDZIALEK) > 0)
            System.out.println(Day.PIATEK + " ma numer większy niż " + Day.PONIEDZIALEK + ".");

        else
            System.out.println(Day.PIATEK + " ma numer NIE większy niż " + Day.PONIEDZIALEK + ".");
    }
}
