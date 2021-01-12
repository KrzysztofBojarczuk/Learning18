import java.io.*;

public class TestAverages
{
    public static void main(String[] args)
            throws IOException
        {
            double average;
            int studentNumber = 1;

            TestScoreReader scoreReader =
                    new TestScoreReader("Grades.csv");

            while (scoreReader.readNextLine())
            {
                average = scoreReader.getAverage();

                System.out.println("Średnia studenta numer " + studentNumber + " to " + average + ".");

                studentNumber++;
            }

            scoreReader.close();
            System.out.println("Podobno wszystkich wyniki.");
        }
    }
