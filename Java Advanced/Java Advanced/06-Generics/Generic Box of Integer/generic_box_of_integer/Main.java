package generic_box_of_integer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        while (n-- > 0) {
            String line = scanner.nextLine();
            GenericBoxOfInteger<Integer> box = new GenericBoxOfInteger<>(Integer.parseInt(line));
            System.out.println(box.toString());
        }
    }
}
