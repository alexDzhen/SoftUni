import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        switch (command) {
            case "coffee":
                coffee(quantity);
                break;
            case "water":
                water(quantity);
                break;
            case "coke":
                coke(quantity);
                break;
            case "snacks":
                snacks(quantity);
                break;
        }
    }

    private static void print(double sum) {
        System.out.printf("%.2f", sum);
    }

    private static void snacks(int quantity) {
        print(quantity * 2.00);
    }

    private static void coke(int quantity) {
        print(quantity * 1.40);
    }

    private static void water(int quantity) {
        print(quantity * 1.00);
    }

    private static void coffee(int quantity) {
        print(quantity * 1.50);
    }
}
