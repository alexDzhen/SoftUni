package generic_count_method_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<GenericCountString<String>> boxes = new ArrayList<>();
        while (n-- > 0) {
            String line = scanner.nextLine();
            boxes.add(new GenericCountString<>(line));
        }
        String element = scanner.nextLine();
        int result = countGreaterElements(boxes, new GenericCountString<>(element));
        System.out.println(result);
    }

    private static <T extends Comparable<T>> int countGreaterElements(List<GenericCountString<T>> boxes, GenericCountString<T> element) {
        int counter = 0;
        for (GenericCountString<T> box : boxes) {
            if (box.compareTo(element) > 0) {
                counter++;
            }
        }
        return counter;
    }
}
