package javafundamentals.homework;

public class Car {

    private String id;
    private String brand;
    private String model;
    private CarType carType;
    private Integer horsePower;
    private double tankVolume;
    private double fuelConsumptionPer100Km;
    private double gasolineLevel;


    public Car(String id, String brand, String model, CarType carType, int horsePower, double tankVolume, double fuelConsumptionPer100Km, double gasolineLevel) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.carType = carType;
        this.horsePower = horsePower;
        this.tankVolume = tankVolume;
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
        this.gasolineLevel = gasolineLevel;
    }

    public double fillTank(int volume) {
        System.out.println("we are at gas station, we try to fill tank");
        System.out.println("Actual level: " + gasolineLevel + "liters; trying to add " + volume + " liters");
        gasolineLevel += volume;
        System.out.println("New gasoline level: " + gasolineLevel + " liters");
        return gasolineLevel;
    }

    public void drive(int distance) {
        System.out.println("Driving car id:[" + id + "]; distance: [" + distance + "]");
        double burnedFuel = (fuelConsumptionPer100Km * distance / 100);
        gasolineLevel = gasolineLevel - burnedFuel;
        System.out.println(brand + ", " + model + " burned  " + burnedFuel + " liters; new level: " + gasolineLevel);
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public CarType getCarType() {
        return carType;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public double getFuelConsumptionPer100Km() {
        return fuelConsumptionPer100Km;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carType=" + carType +
                ", horsePower=" + horsePower +
                ", tankVolume=" + tankVolume +
                ", fuelConsumptionPer100Km=" + fuelConsumptionPer100Km +
                ", gasolineLevel=" + gasolineLevel +
                '}';
    }
}
