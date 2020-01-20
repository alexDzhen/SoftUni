import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readIntMatrix(scanner);
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }
        System.out.println(String.format("%d%n%d%n%d%n", matrix.length, matrix[0].length, sum));
    }

    private static int[][] readIntMatrix(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split(",\\s+");
        int rows = Integer.parseInt(split[0]);
        int cols = Integer.parseInt(split[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] intLine = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = intLine;
        }
        return matrix;
    }
}
