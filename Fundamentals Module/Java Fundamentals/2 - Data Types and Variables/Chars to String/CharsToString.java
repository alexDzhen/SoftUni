import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);
        String string = Character.toString(firstChar)+Character.toString(secondChar)+Character.toString(thirdChar);
        System.out.println(string);
    }
}
