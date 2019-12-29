import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfInt = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < arrayOfInt.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft += arrayOfInt[j];
            }
            for (int k = i + 1; k < arrayOfInt.length; k++) {
                sumRight += arrayOfInt[k];
            }
            if (sumLeft == sumRight) {
                System.out.println(i);
                if (arrayOfInt[i] == 0 && arrayOfInt[i + 1] == 0) {
                    continue;
                } else {
                    return;
                }
            }
        }
        System.out.println("no");
    }
}
