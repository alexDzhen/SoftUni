import java.util.ArrayDeque;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readIntMatrix(scanner);
        int number = scanner.nextInt();
        ArrayDeque<String> answers = new ArrayDeque<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (number == matrix[row][col]) {
                    String matchingPair = row + " " + col;
                    answers.offer(matchingPair);
                }
            }
        }
        if (answers.isEmpty()) {
            System.out.println("not found");
        }
        while (!answers.isEmpty()) {
            System.out.println(answers.poll());
        }
    }

    private static int[][] readIntMatrix(Scanner scanner) {
        String line = scanner.nextLine();
        String[] split = line.split("\\s+");
        int rows = Integer.parseInt(split[0]);
        int cols = Integer.parseInt(split[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
