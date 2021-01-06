public class Stock
{
    private String symbol;     // Symbol gie�dowy.
    private double sharePrice;  // Aktualna cena akcji.

    /**
     Konstruktor
     @param sym Symbol gie�dowy.
     @param price Cena akcji.
     */

    public Stock(String sym, double price)
    {
        symbol = sym;
        sharePrice = price;
    }

    /**
     Metoda getSymbol.
     @return Symbol gie�dowy.
     */

    public String getSymbol()
    {
        return symbol;
    }

    /**
     Metoda getSharePrice.
     @return Cena akcji.
     */

    public double getSharePrice()
    {
        return sharePrice;
    }

    /**
     Metoda toString.
     @return �a�cuch znak�w zawieraj�cy
     kod i cen� akcji.
     */

    public String toString()
    {
        // Tworzenie �a�cucha znak�w opisuj�cego akcje.
        String str = "Symbol gie�dowy: " + symbol +
                "\nCena akcji: " + sharePrice;

        // Zwracanie �a�cucha znak�w.
        return str;
    }

    /**
     Metoda equals por�wnuje dwa obiekty typu Stock.
     @param object2 Obiekt typu Stock por�wnywany z
     obiektem typu Stock, kt�ry wywo�a� metod�.
     @return true, je�li obiekt podany jako argument jest r�wny
     obiektowi, kt�ry wywo�a� metod�.
     */

    public boolean equals(Stock object2)
    {
        boolean status;

        // Okre�lanie, czy pola symbol i sharePrice
        // danego obiektu s� r�wne wzgl�dem p�l
        // symbol i sharePrice obiektu object2.
        if (symbol.equals(object2.symbol) &&
                sharePrice == object2.sharePrice)
            status = true;  // Tak, obiekty s� sobie r�wne.
        else
            status = false; // Nie, obiekty nie s� sobie r�wne.

        // Zwracanie warto�ci zmiennej status.
        return status;
    }

    /**
     Metoda copy tworzy kopi� obiektu typu Stock.
     @return Referencja do kopii obiektu, kt�ry wywo�a� metod�.
     */

    public Stock copy()
    {
        // Tworzenie nowego obiektu typu Stock i inicjowanie
        // go danymi przechowywanymi w obiekcie zawieraj�cym wywo�an� metod�.
        Stock copyObject = new Stock(symbol, sharePrice);

        // Zwracanie referencji do nowego obiektu.
        return copyObject;
    }
}
