import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num <= 0) {
            System.out.println(0);
        } else if (num == 1) {
            System.out.print(1);
        } else if (num == 2) {
            System.out.print("1 1");
        } else if (num == 3) {
            System.out.print("1 1 2");
        } else {
            System.out.print("1 1 2 ");
            getTribonacci(num);
        }
    }

    private static void getTribonacci(int num) {
        int minus3 = 1;
        int minus2 = 1;
        int minus1 = 2;
        int max = num;
        for (int i = 0; i < max - 3; i++) {
            num = minus3 + minus2 + minus1;
            minus3 = minus2;
            minus2 = minus1;
            minus1 = num;
            System.out.printf("%d ", num);
        }
    }
}
