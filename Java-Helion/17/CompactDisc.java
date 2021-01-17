public class CompactDisc implements Retailltem
{
    private String title;
    private String artist;
    private double retailPrice;

    public CompactDisc(String cdTitle, String cdArtist, double cdPrice)
    {
        title = cdTitle;
        artist = cdArtist;
        retailPrice = cdPrice;
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public double getRetailPrice()
    {
        return retailPrice;
    }
}
