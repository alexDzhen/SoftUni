import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] first = readCharMatrix(scanner,rows);
        char[][] second = readCharMatrix(scanner,rows);
        char[][] answer = new char [rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (first[row][col] == second[row][col]){
                    answer[row][col]= first[row][col];
                }else {
                    answer[row][col] = '*';
                }
            }
        }
        printCharMatrix(answer);
    }

    private static void printCharMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }

    private static char[][] readCharMatrix(Scanner scanner, int rows) {
        char[][] matrix = new char[rows][];
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String strippedString = line.replaceAll("\\s+", "");
            matrix[row] = strippedString.toCharArray();
        }
        return matrix;
    }
}
