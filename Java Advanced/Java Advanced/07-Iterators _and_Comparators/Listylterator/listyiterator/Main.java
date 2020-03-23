package listyiterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = Arrays.stream(scanner.nextLine().split("\\s+")).skip(1).toArray(String[]::new);
        ListlyIterator listlyIterator = new ListlyIterator(strings);
        String input;
        while (!"END".equals(input = scanner.nextLine())) {
            switch (input) {
                case "Move":
                    System.out.println(listlyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listlyIterator.hasNext());
                    break;
                case "Print":
                    try {
                        System.out.println(listlyIterator.getCurrentElement());
                    } catch (UnsupportedOperationException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;

            }
        }
    }
}
