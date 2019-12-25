import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int theInteger = scanner.nextInt();
        int times = scanner.nextInt();
        if (times <= 10) {
            for (int i = times; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", theInteger, i, theInteger * i);
            }
        } else {
            System.out.printf("%d X %d = %d", theInteger, times, theInteger * times);
        }
    }
}
