package raw_data;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Car> cars = GetCars(scanner);
        PrintCars(cars, scanner);
    }

    private static void PrintCars(ArrayDeque<Car> cars, Scanner scanner) {
        String command = scanner.nextLine();
        for (Car car : cars) {
            if (car.getCargo().getType().equals(command) && command.equals("fragile")) {
                boolean isOne = false;
                for (Tire tire : car.getTires()) {
                if (tire.getPressure() < 1) {
                    System.out.println(car.getModel());
                    break;
                    }
                }
            } else if (car.getCargo().getType().equals(command) && command.equals("flamable") && car.getEngine().getPower() > 250) {
                System.out.println(car.getModel());
            }
        }

    }

    private static ArrayDeque<Car> GetCars(Scanner scanner) {
        ArrayDeque<Car> cars = new ArrayDeque<>();
        int numberOfCars = Integer.parseInt(scanner.nextLine());
        while (cars.size() < numberOfCars) {
            String[] input = scanner.nextLine().split("\\s+");
            Engine engine = new Engine(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            Cargo cargo = new Cargo(Integer.parseInt(input[3]), input[4]);
            Tire[] tires = new Tire[]{
                    new Tire(Integer.parseInt(input[6]), Double.parseDouble(input[5])),
                    new Tire(Integer.parseInt(input[8]), Double.parseDouble(input[7])),
                    new Tire(Integer.parseInt(input[10]), Double.parseDouble(input[9])),
                    new Tire(Integer.parseInt(input[12]), Double.parseDouble(input[11]))
            };
            cars.offer(new Car(input[0], engine, cargo, tires));
        }
        return cars;
    }
}
