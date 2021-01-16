public abstract class Student
{
    private String name;
    private String idNumber;
    private int yearAdmitted;

    public Student(String n, String id, int year)
    {
        name = n;
        idNumber = id;
        yearAdmitted = year;
    }
    public String toString()
    {
        String str;

        str = "Nazwisko: " + name + "\nIdentyfikator: " + idNumber + "\nRok przyjęcia: " + yearAdmitted;

        return str;

    }

    public abstract int getRemainingHours();
}
