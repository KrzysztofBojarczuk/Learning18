import java.io.*;

public class CopyFile
{
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if(args.length !=2) {
            System.out.println("Sposób użycia: CopyFile źródło cel");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Błąd wejścia-wyjścia: " +e);
        }finally {
            try {
                if(fin !=null) fin.close();
            }catch (IOException e2){
                System.out.println("Błąd zmaykania pliku źródłowego");
            }
            try {
                if(fout != null) fout.close();
                }catch (IOException e2) {
                System.out.println("Błąd zamykania pliku docelowego");
            }
        }
    }
}
