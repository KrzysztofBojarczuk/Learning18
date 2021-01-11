class A {
    synchronized void foo(B b)
    {
        String name = Thread.currentThread().getName();

        System.out.println(name + " wszedł do A.foo");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Pzzewano A");
        }
        System.out.println(name + " próbuje wywołać B.last()");
        b.last();
    }
    synchronized void last() {
        System.out.println("Wewnątrz A.last");
    }
}
class B
{
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " wszedł do B.bar");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Przewano B");
        }
        System.out.println(name + " próbuje wywoałć A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("Wewnątrz B.last");
    }
}

public class Deadlock implements Runnable
{
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Wątek główny");
        Thread t = new Thread(this, "Wątek wyścigu");
        t.start();

        a.foo(b);
        System.out.println("Powrót do wątku głównego");
    }
    public void run(){
        b.bar(a);
        System.out.println("Powrót do wątku głównego");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
