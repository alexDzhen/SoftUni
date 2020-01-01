import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        if (n == 1) {
            System.out.println(1);
        } else if (n > 1 && n <= 50) {
            double a = 1;
            double b = 1;
            for (int i = 1; i < n; i++) {
                a = a + b;
                double test = b;
                b = a;
                a = test;
            }
            System.out.println(String.format("%.0f", a));
        } else if (n == 0) {
            System.out.println(0);
        }
    }
}
