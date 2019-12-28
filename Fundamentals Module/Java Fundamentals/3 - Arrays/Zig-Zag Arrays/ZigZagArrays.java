import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstOutput = new String[n];
        String[] secondOutput = new String[n];
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstOutput[i] = input[0];
                secondOutput[i] = input[1];
            } else {
                firstOutput[i] = input[1];
                secondOutput[i] = input[0];
            }
        }
        System.out.println(String.join(" ", firstOutput));
        System.out.println(String.join(" ", secondOutput));
    }
}
