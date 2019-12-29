import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] train = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            int numTrain = Integer.parseInt(scanner.nextLine());
            train[i] = numTrain;
            total += numTrain;
            if (i == n -1){
                System.out.println(numTrain);
            } else {
                System.out.print(String.format("%d ",numTrain));
            }
        }
        System.out.println(total);
    }
}
