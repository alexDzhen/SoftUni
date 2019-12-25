import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        if (a >= b && a >= c) {
            System.out.println(a);
            if (b >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
            if (c >= b) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else if (b >= a && b >= c) {
            System.out.println(b);
            if (a >= c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
            if (c >= a) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (c >= a && c >= b) {
            System.out.println(c);
            if (b >= a) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
            if (a >= b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }
    }
}