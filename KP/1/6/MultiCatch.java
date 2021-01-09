public class MultiCatch
{
    public static void main(String[] args) {
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 40 / a;
            int c[] = { 1 };
            c[42] = 99;
        } catch(ArithmeticException e) {
            System.out.println("Dzielenie przez zero: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks poza dopuszczalnymi granicami: " + e);
        }
        System.out.println("Po blokach try i catch.");
    }
}
