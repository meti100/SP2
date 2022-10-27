public class Main
{
    public static void main(String[] args)
    {

        FleetOfCars fleet = new FleetOfCars();


        fleet.addCar(new GasolinCar("GS 45 977", "Citroen", "C3", 5, 22));
        fleet.addCar(new GasolinCar("GH 67 374", "Ford", "Focus", 5, 15));
        fleet.addCar(new GasolinCar("JK 23 764", "Skoda", "Enyaq", 5, 45));

        fleet.addCar(new DieselCar("PO 98 375", "VW", "Golf", 5, 39, true));
        fleet.addCar(new DieselCar("JH 34 785", "Nissan", "Qashqai", 5, 45, false));
        fleet.addCar(new DieselCar("DC 12 254", "BMW", "520d", 7, 23, true));

        fleet.addCar(new ElectricCar("UY 78 896", "Porsche", "Cayenne", 5, 80, 502));
        fleet.addCar(new ElectricCar("KL 53 564", "Tesla", "Model 3", 5, 110, 510));
        fleet.addCar(new ElectricCar("DS 67 902", "Seat", "Cupra", 3, 80, 380));

        System.out.println(fleet);
        System.out.println("The total car tax = " + fleet.getTotalRegistrationFeeForFleet());


    }
}
