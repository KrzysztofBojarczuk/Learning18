import java.util.Scanner;

public class CubeDemo
{
    public static void main(String[] args) {
        double length;
        double width;
        double height;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj następujące " + "wymiary prostopadłościanu:");
        System.out.print("Długość: ");
        length = keyboard.nextDouble();

        System.out.print("Szerokość: ");
        width = keyboard.nextDouble();

        System.out.print("Wysokość: ");
        height = keyboard.nextDouble();

        Cube myCube = new Cube(length, width, height);

        System.out.println("Oto cechu " + "prostopadłościanu.");

        System.out.println("Długość: " + myCube.getLength());

        System.out.println("Szerokość: " + myCube.getWidth());

        System.out.println("Wysokość: " + myCube.getHeight());

        System.out.println("Powierzchnia podstawy: " + myCube.getArea());

        System.out.println("Pole całkowite: " + myCube.getSurfaceArea());

        System.out.println("Objętość: " + myCube.getVolume());


    }
}
