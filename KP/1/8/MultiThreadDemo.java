class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Nowy wątek: " +t);
        t.start();
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Przerwano " + name);
        }
        System.out.println("Zakończenie " + name);
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("Jeden");
        new NewThread("Dwa");
        new NewThread("Trzy");

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            System.out.println("Przerwano wątek główny");
        }

        System.out.println("Koniec wątku głównego.");
    }
}
