public class NonGenDemo
{
    public static void main(String[] args) {
        NonGen iOB;

        iOB = new NonGen(88);

        iOB.showType();

        int v = (Integer) iOB.getOb();
        System.out.println("wartość: " + v);

        System.out.println();

        NonGen strOb = new NonGen("Test dla braku parametryzacji");

        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("wartosć: " + str);

        iOB = strOb;
        v = (Integer) iOB.getOb();
    }
}
