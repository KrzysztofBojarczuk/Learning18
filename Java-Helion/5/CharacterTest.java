import javax.swing.JOptionPane;

public class CharacterTest {
    public static void main(String[] args) {
        String input;
        char ch;

        input = JOptionPane.showInputDialog("Podaj " + "dowolny znak:");

        ch = input.charAt(0);

        if (Character.isLetter(ch)) {
            JOptionPane.showMessageDialog(null, "Ten znak to litera.");
            ;
        }

        if (Character.isDigit(ch)) {
            JOptionPane.showMessageDialog(null, "Ten znak to mała cyfra.");
        }
        if (Character.isLowerCase(ch)) {
            JOptionPane.showMessageDialog(null, "Ten znak to mała litera.");
        }
        if (Character.isUpperCase(ch)) {
            JOptionPane.showMessageDialog(null, "Ten znak to wielka litera");
        }
        if (Character.isSpaceChar(ch)) {
            JOptionPane.showMessageDialog(null, "Ten znak to spacja.");
        }
        if (Character.isWhitespace(ch))
        {
            JOptionPane.showMessageDialog(null, "To biały znak.");
        }
            System.exit(0);

    }
}
