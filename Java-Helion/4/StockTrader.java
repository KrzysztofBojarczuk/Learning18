import java.util.Scanner;

public class StockTrader
{
    public static void main(String[] args)
    {
        int sharesToBuy;

        Stock xyzCompany = new Stock("XYZ", 9.62);

        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Akcje XYZ kosztują obecnie %,.2f złotego.\n", xyzCompany.getSharePrice());

        System.out.print("Ile akcji chcesz kupić? ");
        sharesToBuy = keyboard.nextInt();

        StockPurchase buy = new StockPurchase(xyzCompany, sharesToBuy);

        System.out.printf("Cena zakupu: %,.2f", buy.getCost());
    }
}
