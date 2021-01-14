import java.io.*;

public class ShowFile {
    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;

        if(args.length != 1){
            System.out.println("Sposób uzycia: ShowFile nazwa-pliku");
            return;
        }

        try {
            fin = new FileInputStream(args[1]);
            do {
                i = fin.read();
                if(i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd wejścia-wyjścia");
        } finally {
            try {
                if(fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Błąz zmaykania pliku");
            }
        }
    }
}
