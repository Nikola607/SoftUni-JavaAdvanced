package DefiningClasses;

public class CarConstructor {
    private String brand;
    private String model;
    private int horsePower;

    public CarConstructor(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public CarConstructor(String brand) {
        this(brand, "unknown", -1);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
