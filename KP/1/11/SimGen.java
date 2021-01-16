public class SimGen
{
    public static void main(String[] args)
    {
        TwoGen<Integer, String> tgObj =
        new TwoGen<Integer, String>(88, "Parametyrzacja");

        tgObj.showTypes();

        int v = tgObj.getob1();
        System.out.println("wartość: " + v);

        String str = tgObj.getob2();
        System.out.println("wasrtość: " + str);
    }
}
