package javafundamentals.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Creati un model pentru o masina (Car) care contine:
 * - atributele:
 *   - brand - String
 *   - model - String
 *   - anFabricatie - int
 *   - carType - CarType (se poate folosi cel din proiect)
 *   - kilometraj -  int (nr de kilometri din bordul masinii)
 *   - volum rezvor - double
 *   - nivel combustibil - double
 *   - consum (l/100km) - double
 * - comportament: (metode -precum cea fillTank - cea de la curs)
 *   - verificaNivelCombustibil
 *   - verifica numar km
 *   - verifica anul de fabricare
 *   - alimenteaza
 *   - testDrive
 *      - masina parcurge o anumita distanta (creste numarul de km si scade nivelul combustibilului)
 *      - nu poate parcurge km mai multi decat combustibil are
 *   - vinde masina
 *      - citestre pret
 *      - afisare detalii: masina {...} s-a vandut cu suma de x euro
 *      - eliminare masina din parc
 * <p>
 * Creati un model pentru un parc auto care contine:
 * - atribuite:
 *   - numele parcului -  va fi citit de la tastatura, in exemplul dat nu e citit de la tastatura
 *   - capacitate parcului
 *       - daca se umple parcul nu mai acceptati masini in el
 *       - afisezi un mesaj masina nu mai are loc in parc
 *   - o lista de masini
 *
 * - comportament:
 *  - creare parc auto
 *  - adauga masina in parc
 *  - cate masini sunt in parc
 *  - taote masinile grupate dupa tipul combustibilului folosit
 *  - toate masinile care au numarul de km mai mic decat o anumita valoare citita de la tastatura
 *  - cate masini au fost vandute
 *
 *  Cerinta:
 *  Pentru fiecare liniuta de la comportament,
 *  va trebui sa adaugati o optiune noua si sa implementati functionalitatea aferenta optiunii.
 *  Atribtutele care lipsesc din fiecare obiect va trebui sa le adugati (kilometraj, capacitateParc, etc)
 *
 */
public class Main {

    static Scanner in = new Scanner(System.in);

    static CarMarket carMarket = new CarMarket();

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        boolean isNewStart = true;
        String option = "start";

        while (isNewStart == true && option != "exit") {
            System.out.println("available options: [addCar, list, drive, exit]");
            System.out.print("option=");
            option = in.next();

            switch (option) {
                case "addCar":
                    Car car = createCar();
                    carMarket.addCarToPark(car);
                    break;
                case "list":
                    listCar(carMarket);
                    break;
                case "drive":
                    driveCar();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.err.println("Invalid option");
            }
        }

    }

    private static void driveCar() {
        System.out.println("Drive car");
        Car car;
        do {
            System.out.print("carId=");
            String id = in.next();
            car = carMarket.findCarById(id);
        }
        while (car == null);

        System.out.print("distance=");
        int dist = in.nextInt();
        car.drive(dist);
        System.out.println("------");
    }

    private static void listCar(CarMarket carMarket) {
        System.out.println("List all cars:");
        carMarket.listCars();
        System.out.println("------");
    }

    private static Car createCar() {
        System.out.println("Provide details for new car:");
        //read id
        System.out.print("id=");
        String id = in.next();
        //brand
        System.out.print("brand=");
        String brand = in.next();
        //model
        System.out.print("model=");
        String model = in.next();

        //car type
        CarType carType;
        do  {
            System.out.print("carType=");
            String type = in.next();
            carType = CarType.fromString(type);
        } while (carType == null);

        //horse power

        //tank volume

        //fuel consumption

        //fuel level

        System.out.println("-----");

        return new Car(id, brand, model, carType, 100, 60, 6, 25);
    }
}
