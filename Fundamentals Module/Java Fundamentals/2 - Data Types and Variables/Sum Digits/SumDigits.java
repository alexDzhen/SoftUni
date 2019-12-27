import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0) {
            int n = num % 10;
            sum += n;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
