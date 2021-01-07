public class CourseDemo
{
    public static void main(String[] args) {
        Instrcutor myInstructor = new Instrcutor("Krawczyk", "Szymon", "RH3010");

        TextBook myTextBook = new TextBook("Java dla zupełnie początkujących", "Gaddis", "Helion");

        Course myCourse = new Course("Wprowadzenie do Javy", myInstructor, myTextBook);

        System.out.println(myCourse);
    }

}
