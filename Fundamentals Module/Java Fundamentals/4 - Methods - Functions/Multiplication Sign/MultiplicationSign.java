import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int count = positiveNegativeZero(firstNum, secondNum, thirdNum);
        if (count == -1) {
            System.out.println("zero");
        } else if (count % 2 == 0) {
            System.out.println("negative");
        } else if (count % 2 != 0) {
            System.out.println("positive");
        }
    }

    private static int positiveNegativeZero(int firstNum, int secondNum, int thirdNum) {
        int count = 0;
        if (firstNum == 0 || secondNum == 0 || thirdNum == 0) {
            count = -1;
            return count;
        }
        if (firstNum > 0) {
            count++;
        }
        if (secondNum > 0) {
            count++;
        }
        if (thirdNum > 0) {
            count++;
        }
        return count;
    }
}
