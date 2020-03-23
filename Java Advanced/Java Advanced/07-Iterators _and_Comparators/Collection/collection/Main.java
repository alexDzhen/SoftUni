package collection;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = Arrays.stream(scanner.nextLine().split("\\s+")).skip(1).toArray(String[]::new);
        Collection collection = new Collection(strings);
        String input;
        while (!"END".equals(input = scanner.nextLine())) {
            switch (input) {
                case "Move":
                    System.out.println(collection.move());
                    break;
                case "HasNext":
                    System.out.println(collection.hasNext());
                    break;
                case "Print":
                    try {
                        System.out.println(collection.getCurrentElement());
                    } catch (UnsupportedOperationException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "PrintAll":
                    collection.forEach(e -> {
                        System.out.print(e + " ");
                    });
                    System.out.println();
                    break;
            }
        }
    }
}
