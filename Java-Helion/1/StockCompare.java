public class StockCompare
{
    public static void main(String[] args) {

        Stock company1 = new Stock("XYZ", 9.62);
        Stock company2 = new Stock("XYZ", 9.62);

        if (company1.equals(company2))
            System.out.println("Obiekty są takie same.");
        else
            System.out.println("Obiekty różnią się od siebie.");
    }
}
