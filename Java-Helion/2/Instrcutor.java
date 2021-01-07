public class Instrcutor
{
    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instrcutor(String lname, String fname, String office)
    {
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }

    public Instrcutor(Instrcutor object2)
    {
        lastName = object2.lastName;
        firstName = object2.firstName;
        officeNumber = object2.officeNumber;
    }

    public void set(String lname, String fname, String office)
    {
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }
    public String toString()
    {
        String str = "Nazwisko: " + lastName + "\nImię: " + firstName + "\nNumber gabinetu: " + officeNumber;

        return str;
    }
}
