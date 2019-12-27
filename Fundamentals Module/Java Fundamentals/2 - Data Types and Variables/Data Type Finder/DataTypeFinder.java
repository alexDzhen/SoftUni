import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (!"END".equals(input = scanner.nextLine())) {
            boolean isInteger = true;
            try {
                int integer = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                isInteger = false;
            }
            boolean isDouble = true;
            try {
                double doubl = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                isDouble = false;
            }
            if (isInteger) {
                System.out.printf("%s is integer type%n", input);
            } else if (isDouble) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n",input);
            }else if (input.equalsIgnoreCase("true") || (input.equalsIgnoreCase("false"))){
                System.out.printf("%s is boolean type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }
        }
    }
}
