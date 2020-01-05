import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("%.0f", calculate(firstNum, operator, secondNum)));
    }

    private static double calculate(int a, String operator, int b) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = (a * 1.0) / b;
                break;
            case "*":
                result = (a * 1.0) * b;
                break;
            case "-":
                result = (a * 1.0) - b;
                break;
            case "+":
                result = (a * 1.0) + b;
                break;
        }
        return result;
    }
}
