public class CompSciStudent extends Student
{
    private final int MATH_HOURS = 20;
    private final int CS_HOURS = 40;
    private final int GEN_ED_HOURS = 60;

    private int matHours;
    private int csHours;
    private int genEdHours;

    public CompSciStudent(String n, String id, int year)
    {
        super(n, id, year);
    }

    public void setMathHours(int math)
    {
        matHours = math;
    }

    public void setCsHours(int cs)
    {
        csHours = cs;
    }
    public void setGenEdHours(int genEd)
    {
        genEdHours = genEd;
    }

    @Override
    public int getRemainingHours()
    {
        int reqHours,
                remainninHours;

        reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;

        remainninHours = reqHours - (matHours + csHours + genEdHours);

        return remainninHours;
    }

    @Override
    public String toString()
    {
        String str;

        str = super.toString() +
                "\nKierunek: Inforamtyka" +
                "\nZaliczone godziny mateamtyki: " + matHours +
                "\nZaliczone godziny informatyki: " + csHours +
                "\nZalcizone godziny edukacji goólnej: " + genEdHours;

        return str;
    }

}
