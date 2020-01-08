import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> namesIn = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] command = input.split("\\s+");
            String name = command[0];
            boolean isInTheList = false;
            boolean isNotInTheList = false;
            if (!"not".equalsIgnoreCase(command[2])) {
                for (String names : namesIn) {
                    if (names.equals(name)) {
                        isInTheList = true;
                        break;
                    }
                }
                if (isInTheList) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    namesIn.add(name);
                }
            } else {
                if (!namesIn.contains(name)) {
                    System.out.printf("%s is not in the list!%n", name);
                } else {
                    namesIn.remove(name);
                }
            }
        }
        for (String name : namesIn) {
            System.out.println(name);
        }
    }
}
