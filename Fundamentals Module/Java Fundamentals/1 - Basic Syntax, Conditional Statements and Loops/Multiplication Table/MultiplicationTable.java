import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theInteger = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", theInteger, i, theInteger * i);
        }
    }
}
