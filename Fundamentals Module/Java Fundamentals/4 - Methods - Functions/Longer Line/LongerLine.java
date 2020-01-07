import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());
        longestLine(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    private static void longestLine(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double firstLine = Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
        double secondLine = Math.sqrt(Math.pow(Math.abs(x3 - x4), 2) + Math.pow(Math.abs(y3 - y4), 2));
        if (firstLine >= secondLine) {
            closestToZero(x1, y1, x2, y2);
        } else {
            closestToZero(x3, y3, x4, y4);
        }
    }

    private static void closestToZero(double x1, double y1, double x2, double y2) {
        double first = Math.sqrt(Math.pow(Math.abs(x1), 2) + Math.pow(Math.abs(y1), 2));
        double second = Math.sqrt(Math.pow(Math.abs(x2), 2) + Math.pow(Math.abs(y2), 2));
        if (first > second) {
            System.out.println(String.format("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1));
        } else {
            System.out.println(String.format("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2));
        }
    }
}
