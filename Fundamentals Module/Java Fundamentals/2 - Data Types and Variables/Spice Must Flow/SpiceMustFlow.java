import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spice = Integer.parseInt(scanner.nextLine());
        int income = 0;
        int days = 0;
        while (spice >= 100) {
            income += spice - 26;
            days++;
            spice -= 10;
        }
        if (income >= 26) {
            income -= 26;
        }
        System.out.println(days);
        System.out.println(income);
    }
}
