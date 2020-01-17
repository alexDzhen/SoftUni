import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        memory = new long[n + 1];
        long result = fibonacci(n);
        System.out.println(result);
    }

    private static long[] memory;

    private static long fibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        return memory[n] = fibonacci(n - 2) + fibonacci(n - 1);
    }
}
