package DefiningClasses.SpeedRacing;

public class Car {
    private String model;
    private int fuelAmount;
    private double FuelPrice;

    public Car(String model, int fuelAmount, double fuelPrice) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        FuelPrice = fuelPrice;
    }

    public String getModel() {
        return model;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelPrice() {
        return FuelPrice;
    }
}
