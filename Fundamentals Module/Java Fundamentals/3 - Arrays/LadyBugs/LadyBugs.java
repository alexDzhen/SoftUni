import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] field = new int[Integer.parseInt(scanner.nextLine())];
        int[] indexes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < indexes.length; i++) {
            if (indexes[i] >= 0 && indexes[i] < field.length) {
                field[indexes[i]] = 1;
            }
        }
        String input;
        while (!"end".equals(input = scanner.nextLine())) {
            String[] command = input.split(" ");
            int index = Integer.parseInt(command[0]);
            String direction = command[1];
            int flight = Integer.parseInt(command[2]);
            if (index < 0 || index >= field.length || field[index] == 0) {
                continue;
            }
            field[index] = 0;
            int currentFlight = flight;
            if (direction.equals("right")) {
                while (index + currentFlight < field.length && index + currentFlight >= 0) {
                    if (field[index + currentFlight] == 0) {
                        field[index + currentFlight] = 1;
                        break;
                    } else {
                        currentFlight += flight;
                    }
                }
            } else if (direction.equals("left")) {
                while (index - currentFlight >= 0 && index - currentFlight < field.length) {
                    if (field[index - currentFlight] == 0) {
                        field[index - currentFlight] = 1;
                        break;
                    } else {
                        currentFlight += flight;
                    }
                }
            }
        }
        for (int cell : field) {
            System.out.print(cell + " ");
        }
    }
}
