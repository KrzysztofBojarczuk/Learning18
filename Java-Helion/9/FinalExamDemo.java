import javax.swing.JOptionPane;

public class FinalExamDemo
{
    public static void main(String[] args)
    {
        String input;
        int questions;
        int missed;

        input = JOptionPane.showInputDialog("Z ilu " + "pytań skałda się egzamin końcowy?");
        questions = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Na ile pytań " + "udzielono błędnych odpowiedzi?");
        missed = Integer.parseInt(input);

        FinalExam exam = new FinalExam(questions, missed);

        JOptionPane.showMessageDialog(null,
                "Liczba punktów za każde pytanie: " + exam.getPointsEach() +
                        "\nWynik egzaminu: " +
                        exam.getScore() + "\nOcena z egzaminu: " +
                        exam.getGrade());

        System.exit(0);
    }
}
