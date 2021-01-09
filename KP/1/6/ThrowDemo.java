public class ThrowDemo
{
    static void demoproc() {
        try{
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Złapanie wewnątrz metody demoproc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e) {
            System.out.println("Ponownie złapanie: " + e);
        }
    }
}
