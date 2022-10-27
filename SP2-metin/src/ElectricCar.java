public class ElectricCar extends ACar
{
    private int batteryCapacity;
    private  int maxRange;
    protected double whKm;
    protected int carTax;

    double elecCarRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOFDoors, int batteryCapacity, int maxRange)
    {
        super(registrationNumber, make, model, numberOFDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;

        elecCarRange = (getWhPrKm() / 91.25) / 100;
    }
    int getBatteryCapacityKWh()
    {
        return batteryCapacity;
    }

    int getMaxRangeKm()
    {
        return maxRange;
    }

    int getWhPrKm()
    {
        return (getBatteryCapacityKWh() * 1000) / getMaxRangeKm();
    }

    @Override
    public int getRegistrationFee()
    {
        if(elecCarRange > 20 && elecCarRange <= 50)
        {
            carTax = 330;
        }else if(elecCarRange > 15 && elecCarRange <= 20)
        {
            carTax = 1050;
        } else if (elecCarRange > 10 && elecCarRange <= 15)
        {
            carTax = 2340;
        } else if (elecCarRange >= 5 && elecCarRange <= 10)
        {
            carTax = 5500;
        } else if (elecCarRange < 5)
        {
            carTax = 10470;
        }

        return carTax;
    }

    @Override
    public String toString()
    {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", maxRange=" + maxRange +
                ", elecCarRange=" + elecCarRange +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }

}
