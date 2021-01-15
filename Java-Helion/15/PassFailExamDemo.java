import java.util.Scanner;

public class PassFailExamDemo
{
    public static void main(String[] args) {

        int questions;
        int missed;
        double minPassing;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Z ilu pytań " + "składa się egzamin? ");

        questions = keyboard.nextInt();

        System.out.print("Na ile pytań udzielono " + "do zaliczenia? ");

        missed = keyboard.nextInt();

        System.out.print("Ile punktów potrzeba " + "do zaliczania? ");

        minPassing = keyboard.nextDouble();

        PassFailExam exam = new PassFailExam(questions, missed, minPassing);

        System.out.println("Liczba punktów za każde pytanie: " + exam.getPointsEach());

        System.out.println("Liczba punktów z egzaminu: " + exam.getScore());

        System.out.println("Informację o zlaiczeniu: " + exam.getGrade());
    }
}
