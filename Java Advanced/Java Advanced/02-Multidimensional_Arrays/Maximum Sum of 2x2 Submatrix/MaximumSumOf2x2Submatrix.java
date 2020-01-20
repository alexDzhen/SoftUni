import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readIntMatrix(scanner);
        int bestSum = Integer.MIN_VALUE;
        int resultRow = 0;
        int resultCol = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > bestSum) {
                    bestSum = sum;
                    resultRow = row;
                    resultCol = col;
                }
            }
        }
        for (int row = resultRow; row <= resultRow + 1; row++) {
            for (int col = resultCol; col <= resultCol + 1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(bestSum);
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

