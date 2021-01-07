public class Course
{
    private String courseName;
    private Instrcutor instrcutor;
    private TextBook textBook;

    public Course(String name, Instrcutor instr, TextBook text)
    {
        courseName = name;

        instrcutor = new Instrcutor(instr);

        textBook = new TextBook(text);
    }

    public String getName()
    {
        return courseName;
    }

    public Instrcutor getInstrcutor()
    {
        return new Instrcutor(instrcutor);
    }

    public TextBook getTextBook()
    {
        return new TextBook(textBook);

    }

    public String toString()
    {
        String str = "Nazwa kursu: " + courseName + "\nInforamcje o wykładowcy:\n" + instrcutor +
                "\nInforamcje o podręczniku:\n" + textBook;

        return str;
    }
}
