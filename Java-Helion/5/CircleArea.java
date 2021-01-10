import java.util.Scanner;

public class CircleArea
{
    public static void main(String[] args) {

        double radius;
        double area;
        String input;
        char choice;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Podaj promień koła: ");
            radius = keyboard.nextDouble();

            keyboard.nextLine();

            area = Math.PI * radius * radius;
            System.out.printf("Powiechnia wynosi %.2f.\n", area);

            System.out.print("Chcesz powtórzyć " + "operacje? (T lub N) ");
            input = keyboard.nextLine();
            choice = input.charAt(0);
        } while (Character.toUpperCase(choice) == 'T');
    }
}
