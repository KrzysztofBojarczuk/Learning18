import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str() default "Testowanie";
    int val() default 9000;
}
public class Meta3
{
    @MyAnno()
    public static void myMeth()
    {

        Meta3 ob = new Meta3();

        try {
            Class c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Nie znaleziono metody.");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}
