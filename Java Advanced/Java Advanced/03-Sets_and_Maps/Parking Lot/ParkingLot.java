import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> numbers = new LinkedHashSet<>();
        while (!"END".equals(input)) {
            String[] split = input.split(", ");
            String direction = split[0];
            String carNumber = split[1];
            if ("IN".equals(direction)) {
                numbers.add(carNumber);
            } else if ("OUT".equals(direction)) {
                numbers.remove(carNumber);
            }
            input = scanner.nextLine();
        }
        for (String number : numbers) {
            System.out.println(number);
        }
        if (numbers.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }
    }
}
