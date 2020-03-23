package generic_swap_method_strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<GBox<String>> boxes = new ArrayList<>();
        while (n-- > 0) {
            String line = scanner.nextLine();
            GBox<String> box = new GBox<>(line);
            boxes.add(box);
        }
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        swap(boxes, first,second);
        for (GBox<String> box : boxes) {
            System.out.println(box.toString());
        }
    }

    private static <T> void swap(List<GBox<T>> boxes, int first, int second) {
        GBox<T> tgBox = boxes.get(first);
        boxes.set(first,boxes.get(second));
        boxes.set(second,tgBox);
    }
}
