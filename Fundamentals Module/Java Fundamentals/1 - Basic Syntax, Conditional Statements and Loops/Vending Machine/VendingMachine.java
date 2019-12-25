import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        double total = 0.0;
        while (!"Start".equals(input = scanner.nextLine())) {
            double coin = Double.parseDouble(input);
            if (coin == 0.1){
                total += coin;
            }else if (coin == 0.2){
                total += coin;
            }else if (coin == 0.5){
                total += coin;
            }else if (coin == 1){
                total += coin;
            }else if (coin == 2){
                total += coin;
            }else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
        }
        while (!"End".equals(input = scanner.nextLine())) {
            switch (input) {
                case "Nuts":
                    if (total >= 2.0) {
                        total -= 2.0;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (total >= 0.7) {
                        total -= 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (total >= 1.5) {
                        total -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (total >= 0.8) {
                        total -= 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (total >= 1.0) {
                        total -= 1.0;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
        }
        System.out.printf("Change: %.2f", total);
    }
}