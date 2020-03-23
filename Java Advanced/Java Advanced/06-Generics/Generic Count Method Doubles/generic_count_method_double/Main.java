package generic_count_method_double;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<GenericCountDouble<Double>> boxes = new ArrayList<>();
        while (n-- > 0) {
            String line = scanner.nextLine();
            boxes.add(new GenericCountDouble<>(Double.parseDouble(line)));
        }
        double element = Double.parseDouble(scanner.nextLine());
        int result = countGreaterElements(boxes, new GenericCountDouble<>(element));
        System.out.println(result);
    }

    private static <T extends Comparable<T>> int countGreaterElements(List<GenericCountDouble<T>> boxes, GenericCountDouble<T> element) {
        int counter = 0;
        for (GenericCountDouble<T> box : boxes) {
            if (box.compareTo(element) > 0) {
                counter++;
            }
        }
        return counter;
    }
}
