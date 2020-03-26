import java.util.Scanner;

public class BookWorm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());
        int size = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[size][size];
        int[] position = new int[2];
        for (int i = 0; i < size; i++) {
            String line = scanner.nextLine();
            field[i] = line.toCharArray();
            if (line.contains("P")) {
                position[0] = i;
                position[1] = line.indexOf("P");
            }
        }
        String command;
        while (!"end".equalsIgnoreCase(command = scanner.nextLine())) {
            switch (command) {
                case "up":
                    movePlayer(position[0] - 1, position[1], position, field, text);
                    break;
                case "down":
                    movePlayer(position[0] + 1, position[1], position, field, text);
                    break;
                case "right":
                    movePlayer(position[0], position[1] + 1, position, field, text);
                    break;
                case "left":
                    movePlayer(position[0], position[1] - 1, position, field, text);
                    break;
            }
        }
        System.out.println(text.toString());
        printMatrix(field);
    }

    private static void movePlayer(int newRow, int newCol, int[] position, char[][] field, StringBuilder text) {
        if (isOutOfBound(field, newRow, newCol)) {
            if (text.length() != 0) {
                text.deleteCharAt(text.length() - 1);
            }
            return;
        }
        if (field[newRow][newCol] != '-') {
            text.append(field[newRow][newCol]);
        }
        field[position[0]][position[1]] = '-';
        field[newRow][newCol] = 'P';
        position[0] = newRow;
        position[1] = newCol;
    }

    private static boolean isOutOfBound(char[][] field, int row, int col) {
        return row < 0 || row >= field.length || col < 0 || col >= field[row].length;
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
