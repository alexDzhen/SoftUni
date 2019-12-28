import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputFirst = scanner.nextLine().split(" ");
        String[] inputSecond = scanner.nextLine().split(" ");
        for (String word : inputSecond) {
            for (String secondWord : inputFirst) {
                if (word.equals(secondWord)) {
                    System.out.print(word + " ");
                }
            }
        }
    }
}
