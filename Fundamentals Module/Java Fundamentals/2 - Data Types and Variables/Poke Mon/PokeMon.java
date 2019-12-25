import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        double startPower = n / 2.0;
        int count = 0;
        while (n >= m) {
            n -= m;
            if (n == startPower && y > 0) {
                n /= y;
            }
            count++;
        }
        System.out.println(n);
        System.out.println(count);
    }
}
