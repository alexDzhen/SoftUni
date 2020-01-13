import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        String s1 = input.substring(0, input.indexOf(" "));
//        String s2 = input.substring(input.indexOf(" ")+1);
        String[] input = scanner.nextLine().split(" ");
        String s1 = input[0];
        String s2 = input[1];
        System.out.println(getSum(s1, s2));
    }

    private static int getSum(String s1, String s2) {
        int sum = 0;
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            char first = s1.charAt(i);
            char second = s2.charAt(i);
            sum += first * second;
        }
        String longerWord = s1.length() > s2.length() ? s1 : s2;
        for (int i = minLength; i < longerWord.length(); i++) {
            sum += longerWord.charAt(i);
        }
        return sum;
    }
}
