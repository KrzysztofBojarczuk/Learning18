class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Przykładowy wątek");
        System.out.println("Wątek potomny: " + t);
        t.start();
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Wątek potomny: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("Przerwano działanie potomka");
        }
        System.out.println("Wyjście z wątku potomka.");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Wątek główny: " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Przerwano działanie głównego wątku. ");
        }
        System.out.println("Wyjście z wątku głównego.");
    }
}
