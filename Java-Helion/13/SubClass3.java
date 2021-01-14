public class SubClass3 extends SuperClass3
{
    @Override
    public void showValue(int arg)
    {
        System.out.println("KLASA POCHODNA: " + "Arguemnt typu int to: " + arg);
    }

    public void showValue(double arg)
    {
        System.out.println("KLASA POCHODNA: " + "Arguemnt typu double: " + arg);
    }
}
