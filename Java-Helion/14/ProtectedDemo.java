import javax.swing.JOptionPane;

public class ProtectedDemo
{
    public static void main(String[] args) {
        String input;
        int questions;
        int missed;

        input = JOptionPane.showInputDialog("Z ilu " + "pytań składa się egzamin końcowy?");
        questions = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("Z ilu pytań " + "student udzielił błędnych odpowiedzi?");
        missed = Integer.parseInt(input);

        FinalExam2 exam = new FinalExam2(questions, missed);

        JOptionPane.showMessageDialog(null, "Liczba punktów za pytanie: " +
                exam.getPointsEach() + "\nWynik egzaminu: " + exam.getScore() + "\nOcena z egzaminu: "
        + exam.getGrade());
    }
}
