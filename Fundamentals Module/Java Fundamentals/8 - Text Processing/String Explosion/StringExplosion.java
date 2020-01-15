import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == '>') {
                result.append(">");
                i++;
                //int power = Integer.parseInt(input.charAt(i)+"");
                //int power = Character.getNumericValue(i);
                int power = input.charAt(i) - '0';
                power--;
                while (power > 0 && i < input.length() - 1) {
                    i++;
                    if (input.charAt(i) == '>') {
                        i++;
                        result.append(">");
                        power += input.charAt(i) - '0';
                        power--;
                        continue;
                    }
                    power--;
                }
            } else {
                result.append(symbol);
            }
        }
        System.out.println(result);
    }
}
