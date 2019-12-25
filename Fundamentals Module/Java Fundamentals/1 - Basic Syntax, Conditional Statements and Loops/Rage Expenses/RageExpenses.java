import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double priseHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());
        int trashedHeadset = 0;
        int trashedMouse = 0;
        int trashedKeyboard = 0;
        int trashedDisplay = 0;
        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                trashedHeadset++;
            }
            if (i % 3 == 0) {
                trashedMouse++;
            }
            if (i % 3 == 0 && i % 2 == 0) {
                trashedKeyboard++;
                if (trashedKeyboard % 2 == 0 && trashedKeyboard > 0) {
                    trashedDisplay++;
                }
            }

        }
        double totalSpend = (priceDisplay * trashedDisplay) + (priceKeyboard * trashedKeyboard) + (priceMouse * trashedMouse) + (priseHeadset * trashedHeadset);
        System.out.printf("Rage expenses: %.2f lv.", totalSpend);
    }
}
