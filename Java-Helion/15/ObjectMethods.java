public class ObjectMethods
{
    public static void main(String[] args) {
        PassFailExam exam1 = new PassFailExam(0, 0, 0);

        PassFailExam exam2 = new PassFailExam(0, 0, 0);

        System.out.println(exam1);
        System.out.println(exam2);

        if(exam1.equals(exam1))
            System.out.println("Obiekty są takie same.");
        else
            System.out.println("Obiekty nie są takie same.");

    }
}
