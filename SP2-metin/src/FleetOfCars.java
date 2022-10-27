import java.util.ArrayList;

public class FleetOfCars
{
    private final ArrayList<Car> fleet = new ArrayList<>();

    public FleetOfCars()
    {

    }

    public void addCar(Car car)
    {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet()
    {
        int sum = 0;
        for (Car car: fleet) {
            sum += car.getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString()
    {
        return "FleetOfCars{" +
                "fleet=" + fleet +
                '}';
    }
}
