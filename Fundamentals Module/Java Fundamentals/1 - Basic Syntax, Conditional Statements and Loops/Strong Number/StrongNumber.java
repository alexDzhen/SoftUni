import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int n = Character.getNumericValue(num.charAt(i));
            int fact = 1;
            for (int j = 1; j <= n; j++) {
                fact = fact * j;
            }
            sum += fact;
        }
        if (sum == Integer.parseInt(num)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}