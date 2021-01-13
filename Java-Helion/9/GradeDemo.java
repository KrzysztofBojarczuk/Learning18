import javax.swing.JOptionPane;

public class GradeDemo
{
    public static void main(String[] args) {
        String input;
        double testScore;

        GradedActivity grade = new GradedActivity();

        input = JOptionPane.showInputDialog("Podaj " + " punktowy wynik testu:");

        testScore = Double.parseDouble(input);

        grade.setScore(testScore);

        JOptionPane.showMessageDialog(null, "Ocena z tego testu to " + grade.getGrade() + ".");

        System.exit(0);
    }
}
