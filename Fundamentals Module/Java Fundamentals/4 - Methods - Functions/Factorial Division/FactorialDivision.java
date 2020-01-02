import java.util.Scanner;

public class FactorialDivision {
    private static long factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        double result = factorial(num1) * 1.0 / factorial(num2);
        System.out.printf("%.2f", result);
    }
}
