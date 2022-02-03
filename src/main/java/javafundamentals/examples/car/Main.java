package javafundamentals.examples.car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Dacia", "Duster", CarType.DIESEL);
        System.out.println(car);
        car.drive();

    }
}
