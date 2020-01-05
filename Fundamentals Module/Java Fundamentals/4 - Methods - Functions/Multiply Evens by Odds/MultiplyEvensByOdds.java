import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvensAndOdds(n));
    }

    private static int getMultipleOfEvensAndOdds(int n) {
        int evensSum = getSumOfEvenDigits(n);
        int odsSum = getSumOfOddDigits(n);
        return evensSum * odsSum;
    }

    private static int getSumOfEvenDigits(int n) {
        int evensSum = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 0) {
                evensSum += n % 10;
            }
            n = n / 10;
        }
        return evensSum;
    }

    private static int getSumOfOddDigits(int n) {
        int oddsSum = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 1) {
                oddsSum += n % 10;
            }
            n = n / 10;
        }
        return oddsSum;
    }
}
