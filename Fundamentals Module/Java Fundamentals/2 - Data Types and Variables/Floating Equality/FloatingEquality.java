import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = new BigDecimal(scanner.nextLine());
        BigDecimal b = new BigDecimal(scanner.nextLine());
        BigDecimal diff = (a.subtract(b)).abs();
        if (a.compareTo(b) == 0) {
            System.out.println("True");
        } else {
            if (diff.compareTo(BigDecimal.valueOf(0.000001)) == -1) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
