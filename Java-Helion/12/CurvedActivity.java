public class CurvedActivity extends GradedActivity
{
    double rawScore;
    double percentage;

    public CurvedActivity(double percent)
    {
        percentage = percent;
        rawScore = 0.0;
    }

    @Override
    public void setScore(double s)
    {
        rawScore = s;
        super.setScore(rawScore * percentage);
    }

    public double getRawScore()
    {
        return rawScore;
    }

    public double getPercentage()
    {
        return percentage;
    }
}
