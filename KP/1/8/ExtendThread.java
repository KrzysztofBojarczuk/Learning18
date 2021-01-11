class NewThread extends Thread {
    NewThread(){
        super("Przykładowy wątek");
        System.out.println("Wątek potomny: " + this);
        start();
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--){
                System.out.println("Wątek potomny: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("Przerwano działania potomka.");
        }
        System.out.println("Wyjście z wątku potmoka.");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread();

        try {
            for(int i = 5; i > 0; i--){
                System.out.println("Wątek główny: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Przerwano działanaie głównego wątku.");
        }
        System.out.println("Wyjście z wątku głównego");
    }
}
