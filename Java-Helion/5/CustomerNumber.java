import javax.swing.JOptionPane;

public class CustomerNumber
{
    public static void main(String[] args)
    {
        String input;

        input = JOptionPane.showInputDialog("Podaj " + "numer klienta w formacie LLLCCCC\n" +
                "(LLL = litery i CCCC = cyfry)0");

        if (isValid(input))
        {
            JOptionPane.showMessageDialog(null, "Jest to poprawny numer klienta.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "To nie jest propawny format " +
                    "numer kleinta.\nOto " + "przykład: ABC1234");
        }
        System.exit(0);
    }

    private static boolean isValid(String custNumber)
    {
        boolean goodSoFar = true;
        int i = 0;

        if (custNumber.length() != 7)
            goodSoFar = false;

        while (goodSoFar && i <3)
        {
            if (!Character.isLetter(custNumber.charAt(i)))
                goodSoFar = false;
            i++;
        }
        while (goodSoFar && i < 7)
        {
            if (!Character.isDigit(custNumber.charAt(i)))
                goodSoFar = false;
            i++;
        }
        return goodSoFar;
    }
}
