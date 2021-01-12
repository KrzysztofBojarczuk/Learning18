public class SplitDemo1
{
    public static void main(String[] args) {
        String str = "jeden dwwa trzy cztery";

        String[] tokens = str.split(" ");

        for (String s : tokens)
            System.out.println(s);
    }
}
