public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;

            int b = 42 / a;

            System.out.println("a = " + a);

            try {
                if (a == 1) a = a / (a - a);

                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indeks dopuszczalnymi granicami: " + e);
            }
            } catch (ArithmeticException e) {
                System.out.println("Dzielenie przez 0: " + e);
            }
        }
    }
