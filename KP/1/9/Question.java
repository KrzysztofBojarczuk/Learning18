import java.util.Random;

enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

public class Question
{
    Random rand = new Random();
    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());

        if(prob < 15)
            return Answers.MAYBE;
        else if(prob < 30)
            return Answers.NO;
        else if(prob < 60)
            return Answers.YES;
        else if(prob < 75)
            return Answers.LATER;
        else if(prob < 98)
            return Answers.SOON;
        else
            return Answers.NEVER;
}
}
class AskMe {
    static void answer(Answers result){
        switch (result){
            case NO:
                System.out.println("Nie");
                break;
            case YES:
                System.out.println("Tak");
                break;
            case MAYBE:
                System.out.println("Może");
                break;
            case LATER:
                System.out.println("Później");
                break;
            case SOON:
                System.out.println("Wkrótce");
                break;
            case NEVER:
                System.out.println("Nigdy");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
