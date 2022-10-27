public class GasolinCar extends AFuelCar
{
    int carTax;
    int kmPrLitre;

    String fuelType;

    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre)
    {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }


    @Override
    public String getFuelType()
    {
        fuelType = "Gasoline";
        return fuelType;
    }


    @Override
    public int getRegistrationFee()
    {
        return calcGasCarTax(kmPrLitre);
    }


    public int calcGasCarTax(int kmPrLitre)
    {
        if(kmPrLitre > 20 && kmPrLitre <= 50)
        {
            carTax = 330;
        }else if(kmPrLitre > 15 && kmPrLitre <= 20)
        {
            carTax = 1050;
        } else if (kmPrLitre > 10 && kmPrLitre <= 15)
        {
            carTax = 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre <= 10)
        {
            carTax = 5500;
        } else if (kmPrLitre < 5)
        {
            carTax = 10470;
        }

        return carTax;
    }
}
