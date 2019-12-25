import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0) {
                isValid = true;
                System.out.printf("The number is: %d", Math.abs(num));
            }else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
