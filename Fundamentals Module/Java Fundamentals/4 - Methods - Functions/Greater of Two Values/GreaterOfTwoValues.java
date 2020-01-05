import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kind = scanner.nextLine();
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        switch (kind) {
            case "int":
                int firstNum = Integer.parseInt(a);
                int secondNum = Integer.parseInt(b);
                System.out.println(getMax(firstNum, secondNum));
                break;
            case "char":
                char first = a.charAt(0);
                char second = b.charAt(0);
                System.out.println(getMax(first, second));
                break;
            case "string":
                System.out.println(getMax(a, b));
                break;
        }
    }

    static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }

    static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
