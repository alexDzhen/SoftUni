import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        System.out.println(subtract(a, b, c));
    }

    private static int subtract(int a, int b, int c) {
        int total = sum(a, b) - c;
        return total;
    }

    private static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
