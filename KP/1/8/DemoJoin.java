class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Nowy wątek: " + t);
        t.start();
    }
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Przerwano " + name);
        }
        System.out.println("Zakończenie " + name);
    }
}

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Jeden");
        NewThread ob2 = new NewThread("Dwa");
        NewThread ob3 = new NewThread("Trzy");

        System.out.println("Wątek Jeden żyje: " + ob1.t.isAlive());
        System.out.println("Wątek Dwa żyje: " + ob2.t.isAlive());
        System.out.println("Wątek Trzy żyje: " + ob3.t.isAlive());

        try {
            System.out.println("Oczekiwanie za zakończenie wątków.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Przerwano wątek główny");
        }
        System.out.println("Wątek Jeden żyje: " + ob1.t.isAlive());
        System.out.println("Wątek Dwa żyje: " + ob2.t.isAlive());
        System.out.println("Wątek Trzy żyje: " + ob3.t.isAlive());
        System.out.println("Koniec wątek główny");

    }
}
