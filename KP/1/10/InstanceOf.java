class A{
    int i, j;
}
class B {
    int i, j;
}
class C extends A{
    int k;
}
class D extends A{
    int k;
}

public class InstanceOf
{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if(a instanceof A)
            System.out.println("a to egzemplarz A");
        if(b instanceof B)
            System.out.println("b to egzemplarz B");
        if(c instanceof C)
            System.out.println("c to egzemplarz C");
        if(c instanceof A)
            System.out.println("c może być rzutowany na A");

        if(a instanceof C)
            System.out.println("a może być rzutowany na C");

        System.out.println();

        A ob;

        ob = d;
        System.out.println("ob zawiera referencję do d");
        if(ob instanceof D)
            System.out.println("ob to egzemplarz D");

        System.out.println();

        ob = c;
        System.out.println("ob zawiera referencję do c");

        if(ob instanceof D)
            System.out.println("ob zawiera refrencję do D");
        else
            System.out.println("ob nie może być rzutowany na D");

        if(ob instanceof A)
            System.out.println("ob może być rzutowany na A");

        System.out.println();

        if(a instanceof Object)
            System.out.println("a może być rzutowany na Object");
        if(b instanceof Object)
            System.out.println("b może być rzutowany na Object");
        if(c instanceof Object)
            System.out.println("c może być rzutowany na Object");
        if(d instanceof Object)
            System.out.println("d moze być rzutowany na Object");

    }
}
