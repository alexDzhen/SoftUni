import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> parking = new LinkedHashMap<>();
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCommands; i++) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String name = input[1];
            if ("register".equals(command)) {
                String licencePlate = input[2];
                //add into the map
                if (!parking.containsKey(name)) {
                    parking.put(name, licencePlate);
                    System.out.println(name + " registered " + licencePlate + " successfully");
                } else {
                    String alreadyRegisteredPlate = parking.get(name);
                    System.out.println("ERROR: already registered with plate number " + licencePlate);
                }
            } else if ("unregister".equals(command)) {
                if (!parking.containsKey(name)) {
                    System.out.println("ERROR: user " + name + " not found");
                } else {
                    parking.remove(name);
                    System.out.println(name + " unregistered successfully");
                }
            }
        }
        parking.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
