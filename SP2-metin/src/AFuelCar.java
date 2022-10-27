public abstract class AFuelCar extends ACar
{
    int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre)
    {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }


    int getKmPrLitre()
    {
        return kmPrLitre;
    }

    public abstract String getFuelType();

    @Override
    public String toString()
    {
        return "AFuelCar{" +
                "kmPrLitre=" + kmPrLitre +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
