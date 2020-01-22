import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Pattern pattern = Pattern.compile("Rotate\\(([0-9]+)\\)");
        int degree = 0;
        boolean validInput = false;
        Matcher matcher = pattern.matcher(command);
        while (matcher.find()) {
            degree = Integer.parseInt(matcher.group(1));
            validInput = true;
        }
        if (validInput && degree % 90 == 0) {
            String input = scanner.nextLine();
            List<String> inputList = new LinkedList<>();
            int cols = 0;
            while (!"END".equals(input)) {
                inputList.add(input);
                if (input.length() > cols) {
                    cols = input.length();
                }
                input = scanner.nextLine();
            }
            int rows = inputList.size();
            char[][] matrix = new char[rows][cols];
            for (int row = 0; row < matrix.length; row++) {
                char[] charArr = inputList.get(row).toCharArray();
                for (int col = 0; col < matrix[row].length; col++) {
                    if (col < charArr.length) {
                        matrix[row][col] = charArr[col];
                    } else {
                        matrix[row][col] = ' ';
                    }
                }
            }
            degree = (degree / 90) % 10;
            if (degree == 1 || degree == 5 || degree == 9) {
                for (int col = 0; col < matrix[0].length; col++) {
                    for (int row = matrix.length - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
            } else if (degree == 2 || degree == 6) {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    for (int col = matrix[0].length - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
            } else if (degree == 3 || degree == 7) {
                for (int col = matrix[0].length - 1; col >= 0; col--) {
                    for (int row = 0; row < matrix.length; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
            } else {
                for (int row = 0; row < matrix.length; row++) {
                    for (int col = 0; col < matrix[row].length; col++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
            }
        }
    }
}
