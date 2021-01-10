public class ChainExcDemo
{
    static void demoproc()
    {
        NullPointerException e =
                new NullPointerException("Najwyższy poziom");

        e.initCause(new ArithmeticException("powód"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Orginalny powód: " + e.getCause());
        }
    }
}
