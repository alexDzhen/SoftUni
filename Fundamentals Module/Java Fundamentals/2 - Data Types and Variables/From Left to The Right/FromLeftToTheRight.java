import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        long left  = 0;
        long right = 0;
        int sum = 0;
        for (int i = 0; i < input; i++) {
            left = scanner.nextLong();
            right = scanner.nextLong();
            if (left < right){
                while (right != 0) {
                    sum += right % 10;
                    right /= 10;
                }
                System.out.println(Math.abs(sum));
            } else {
                while (left != 0){
                    sum += left % 10;
                    left /= 10;
                }
                System.out.println(Math.abs(sum));
            }
            sum = 0;
        }
    }
}
