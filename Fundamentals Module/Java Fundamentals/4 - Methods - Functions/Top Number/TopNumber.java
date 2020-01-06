import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        isTopNumber(number);

    }

    private static void isTopNumber(int number) {
        for (int i = 1; i <= number; i++) {
            int sum = 0;
            boolean isOdd = false;
            int copy = i;
            while (true) {
                if (copy == 0) {
                    break;
                }
                int right = copy % 10;
                sum += right;
                if (right % 2 == 1) {
                    isOdd = true;
                }
                copy /= 10;
            }
            if (sum % 8 == 0 && isOdd == true) {
                System.out.println(i);
            }
        }
    }
}
