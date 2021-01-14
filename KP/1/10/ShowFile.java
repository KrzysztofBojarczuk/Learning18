import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if(args.length !=1) {
            System.out.println("Sposob użycia: ShowFile nazwa-pliku");
            return;
        }
            try{
                fin = new FileInputStream(args[0]);
            }catch (FileNotFoundException e) {
                System.out.println("Nie można otowrzyć pliku ");
                return;
            }
            try {
                do{
                    i = fin.read();
                    if(i != -1) System.out.println((char) i);
                } while (i != -1);
            }catch (IOException e) {
                System.out.println("Błąd odczytu pliku ");
            }

            try{
                fin.close();
            } catch (IOException e) {
                System.out.println("Błąd zamykania pliku ");
            }

        }
    }
