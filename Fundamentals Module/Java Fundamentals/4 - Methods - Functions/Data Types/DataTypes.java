import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String value = scanner.nextLine();
        printResult(type, value);
    }

    private static void printResult(String type, String value) {
        switch (type) {
            case "int":
                int integerValue = Integer.parseInt(value);
                int resultInteger = integerValue * 2;
                System.out.println(resultInteger);
                break;
            case "real":
                double doubleValue = Double.parseDouble(value);
                double resultDouble = doubleValue * 1.5;
                System.out.println(String.format("%.2f", resultDouble));
                break;
            case "string":
                System.out.println(String.format("$%s$", value));
                break;
        }
    }
}
