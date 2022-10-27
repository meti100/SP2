public class DieselCar extends AFuelCar
{
    protected boolean particleFilter;

    int carTax;

    int kmPrLitre;

    String fuelType;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    boolean hasParticleFilter()
    {
        return particleFilter;
    }


    @Override
    public String getFuelType()
    {
        fuelType = "Diesel";
        return fuelType;
    }

    @Override
    public String toString()
    {
        return "DieselCar{" +
                "particleFilter=" + particleFilter +
                ", carTax=" + carTax +
                ", kmPrLitre=" + kmPrLitre +
                ", kmPrLitre=" + kmPrLitre +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }

    @Override
    public int getRegistrationFee()
    {
        if(kmPrLitre > 20 && kmPrLitre <= 50)
        {
            carTax = 330 + 130;
        }else if(kmPrLitre > 15 && kmPrLitre <= 20)
        {
            carTax = 1050 + 1390;
        } else if (kmPrLitre > 10 && kmPrLitre <= 15)
        {
            carTax = 2340 + 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10)
        {
            carTax = 5500 + 2770;
        } else if (kmPrLitre < 5)
        {
            carTax = 10470 + 15260;
        }

        if(!hasParticleFilter())
        {
            carTax += 1000;
        }
        return carTax;
    }
}
