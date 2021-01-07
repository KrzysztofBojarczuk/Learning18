public class AskME implements SharedConstans{
    static void answer(int result) {
        switch (result) {
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
    }
}
