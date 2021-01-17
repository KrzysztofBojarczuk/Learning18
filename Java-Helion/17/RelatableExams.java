public class RelatableExams
{
    public static void main(String[] args) {

        FinalExam3 exam1 = new FinalExam3(100, 20);

        FinalExam3 exam2 = new FinalExam3(100, 30);

        System.out.println("Egzamin numer 1: " + exam1.getScore());
        System.out.println("Egzamin numer 2: " + exam2.getScore());

        if(exam1.equals(exam2))
            System.out.println("Wynik egzaminów są takie same.");

        if(exam1.isGreater(exam2))
            System.out.println("Wynik egzaminu numer 1 jest wyższy.");

        if(exam1.isLess(exam2))
            System.out.println("Wynik egzaminu numer 2 jest niższy.");
    }
}
