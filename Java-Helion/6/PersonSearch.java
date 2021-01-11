import java.util.Scanner;

public class PersonSearch
{
    public static void main(String[] args) {
        String lookUp;

        String[] people = {"Cywka, Waldemar", "Dymek, Grzeogrz",
                "Dymek, Joanna", "Rubin, Piotr",
                "Rasiak, Celina", "Sagan,, Cezary",
                "Surynt, Halina", "Szwoch, Borys",
                "Szwoch, Chrystian", "Wilk, Jacek"};

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Podaj kilka pierwszych liter " + "szukanego nazwiska: ");

        lookUp = keyboard.nextLine();

        System.out.println("Oto pasujące nazwiska:");
        for (String person : people)
        {
            if (person.startsWith(lookUp))
                System.out.println(person);
        }
    }
}
