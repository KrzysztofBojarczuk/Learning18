import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Klasa testowa adnotacji")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {

    @What(description = "Metoda testowa andotacji")
    @MyAnno(str = "Testowanie", val = 100)

    public static void myMeth() {
        Meta2 ob = new Meta2();

        try {

            Annotation annos[] = ob.getClass().getAnnotations();

            System.out.println("Wszystkie adnotacje Meta2:");
            for(Annotation a : annos)

                System.out.println(a);

            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("Wszystkie adnotacje myMeth:");
            for (Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException exc) {
            System.out.println("Nie znaleziono metody.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
