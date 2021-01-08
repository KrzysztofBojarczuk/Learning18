public class SportsCarDemo2
{
    public static void main(String[] args) {
        SportsCar yourNewCar = new SportsCar(CarType.PORSCHE, CarColor.CZERWONY, 100000);

        switch (yourNewCar.getMake())
        {
            case PORSCHE :
                System.out.println("Ten samochód wyprodukowano w Niemczech.");
                break;
            case FERRARI:
                System.out.println("Ten samochód wyprodukowano w Włoszech.");
                break;
            case JAGUAR:
                System.out.println("Ten samochód wyprodukowano w Anglii.");
                break;
            default:
                System.out.println("Nie jestem pewien, gdzie wyprodukowano " + "ten samochód");
        }
    }
}
