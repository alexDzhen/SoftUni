import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = Integer.parseInt(scanner.nextLine());
        for (int num = 2; num <= range; num++) {
            boolean isTrue = true;
            for (int splitter = 2; splitter < num; splitter++) {
                if (num % splitter == 0) {
                    isTrue = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", num, isTrue);
        }
    }
}
