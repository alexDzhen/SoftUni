package froggy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] stones = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).toArray(Integer[]::new);
        Lake lake = new Lake(stones);
        StringBuilder builder = new StringBuilder();
        for (Integer integer : lake) {
            builder.append(integer).append(", ");
        }
        System.out.println(builder.toString().substring(0, builder.toString().lastIndexOf(", ")));
    }
}
