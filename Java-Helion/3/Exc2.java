public class Exc2
{
    public static void main(String[] args) {
        int d, a;

        try{
            d = 0;
            a = 42;
            System.out.println("To nie zostanie wyświetlone.");
        } catch (ArithmeticException e) {
            System.out.println("Dzielenie przez zero.");
        }
        System.out.println("Po konstrukcji catch");
    }
}
