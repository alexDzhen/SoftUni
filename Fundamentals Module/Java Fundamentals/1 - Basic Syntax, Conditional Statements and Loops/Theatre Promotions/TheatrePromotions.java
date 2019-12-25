import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfDay = scanner.nextLine();
        int age = scanner.nextInt();
        int price = 0;
        if (0 <= age && age <= 18) {
            if ("Weekday".equals(typeOfDay)) {
                price = 12;
            } else if ("Weekend".equals(typeOfDay)) {
                price = 15;
            } else {
                price = 5;
            }
            System.out.printf("%d$", price);
        } else if (18 < age && age <= 64) {
            if ("Weekday".equals(typeOfDay)) {
                price = 18;
            } else if ("Weekend".equals(typeOfDay)) {
                price = 20;
            } else {
                price = 12;
            }
            System.out.printf("%d$", price);
        } else if (64 < age && age <= 122) {
            if ("Weekday".equals(typeOfDay)) {
                price = 12;
            } else if ("Weekend".equals(typeOfDay)) {
                price = 15;
            } else {
                price = 10;
            }
            System.out.printf("%d$", price);
        } else {
            System.out.println("Error!");
        }
    }
}