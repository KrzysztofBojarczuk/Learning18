import java.io.*;

public class BRReadLines {
    public static void main(String[] args)
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Wpisz wiersze tekstu.");
        System.out.println("Wpisz 'stop', aby wyjść.");
        do{
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));

    }
}
