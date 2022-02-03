package javafundamentals.homework;

import java.util.ArrayList;
import java.util.List;

public class CarMarket {

    private List<Car> carList = new ArrayList<>();

    public CarMarket() {
    }

    public Car findCarById(String id) {
        for(Car c: carList) {
            if(c.getId().equals(id)){
                return c;
            }
        }
        System.out.println("Car not found! Try again.");
        return null;
    }

    public List<Car> addCarToPark(Car car) {
        carList.add(car);
        return carList;
    }

    public void listCars() {
        for(Car car: carList) {
            System.out.println(car);
        }
    }

    public List<Car> getCarList() {
        return carList;
    }
}
