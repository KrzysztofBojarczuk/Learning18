import java.util.Scanner;

public class CurvedActivityDemo
{
    public static void main(String[] args) {

        double score;
        double curvePercent;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Podaj nieprzetworzony " + "wynik punktowy: ");
        score = keyboard.nextDouble();

        System.out.print("Podaj procent określający stopień zmiany wyniku: ");
        curvePercent = keyboard.nextDouble();

        CurvedActivity curvedExam = new CurvedActivity(curvePercent);

        System.out.println("Pierwotna liczba punktów: " + curvedExam.getRawScore());
        System.out.println("Zmodyfikowany wynik: " + curvedExam.getRawScore());
        System.out.println("Ocena z egzaminu: " + curvedExam.getGrade());
    }
}
