import java.util.Random;

interface SharedConstans {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

public class Question implements SharedConstans {
    Random rand = new Random();
    int ask(){
        int prob = (int) (100* rand.nextDouble());
        if (prob < 30)
            return NO;
        else if (prob < 60)
            return YES;
        else if (prob < 70)
            return MAYBE;
        else if (prob < 85)
            return LATER;
        else if (prob < 98)
            return SOON;
        else
            return NEVER;
    }
}
