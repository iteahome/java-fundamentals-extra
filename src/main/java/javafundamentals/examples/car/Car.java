package javafundamentals.examples.car;


public class Car {

    private String brand;
    private String model;
    private CarType carType;

    public Car(String brand, String model, CarType carType) {
        this.brand = brand;
        this.model = model;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carType=" + carType +
                '}';
    }

    public void drive() {
        System.out.println("Driving car: " + this.toString());
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
}
