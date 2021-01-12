import java.util.Scanner;

public class TelephoneTester
{
    public static void main(String[] args) {

        String phoneNumber;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Wpisz niesformatowany numer tefonu: ");

        phoneNumber = keyboard.nextLine();

        System.out.println("Sformatowany numer: " + Telephone.format(phoneNumber));

        System.out.println("Wpisz numer telefonu o foramcie");
        System.out.print("(XXX)XXX-XXX: ");
        phoneNumber = keyboard.nextLine();

        System.out.println("Niesforamtowany numer: " + Telephone.unformat(phoneNumber));


    }
}
