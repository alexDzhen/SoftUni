import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] position = scanner.nextLine().split(", ");
        int x = Integer.parseInt(position[0]);
        int y = Integer.parseInt(position[1]);
        String[][] gameBoard = new String[x][y];

        for (int row = 0; row < x; row++) {
            String line = scanner.nextLine();
            for (int col = 0; col < y; col++) {
                gameBoard[row][col] = String.valueOf(line.charAt(col));
            }
        }

        String[] coordinats = scanner.nextLine().split(", ");
        int x1 = Integer.parseInt(coordinats[0]);
        int y1 = Integer.parseInt(coordinats[1]);
        int n = Integer.parseInt(coordinats[2]);

        int change = 0;

        String[][] nextGeneration = new String[x][y];

        for (int i = 0; i <= n; i++) {
            if (gameBoard[x1][y1].equals("1")) {
                change++;
            }
            for (int row = 0; row < x; row++) {
                for (int col = 0; col < y; col++) {

                    String cell = "";
                    cell = gameBoard[row][col];
                    int greens = checkNeighbours(gameBoard, row, col);

                    if (cell.equals("0")) {
                        if (greens == 3 || greens == 6) {
                            cell = "1";
                        }
                    } else if (cell.equals("1")) {
                        if (greens == 2 || greens == 3 || greens == 6) {
                            cell = "1";
                        } else {
                            cell = "0";
                        }
                    }
                    nextGeneration[row][col] = cell;

                }
            }
            for (int j = 0; j < nextGeneration.length; j++) {
                for (int k = 0; k < nextGeneration[j].length; k++) {
                    gameBoard[j][k] = nextGeneration[j][k];
                }
            }
        }

        System.out.println(change);

    }

    static int checkNeighbours(String[][] gameBoard, int row, int col) {
        int green = 0;
        if (isValidIndex(gameBoard, row - 1, col - 1)) {
            if (gameBoard[row - 1][col - 1].equals("1")) {
                green++;
            }
        }
        if (isValidIndex(gameBoard, row - 1, col)) {
            if (gameBoard[row - 1][col].equals("1")) {
                green++;
            }
        }
        if (isValidIndex(gameBoard, row - 1, col + 1)) {
            if (gameBoard[row - 1][col + 1].equals("1")) {
                green++;
            }
        }
        if (isValidIndex(gameBoard, row, col - 1)) {
            if (gameBoard[row][col - 1].equals("1")) {
                green++;
            }
        }
        if (isValidIndex(gameBoard, row, col + 1)) {
            if (gameBoard[row][col + 1].equals("1")) {
                green++;
            }
        }
        if (isValidIndex(gameBoard, row + 1, col - 1)) {
            if (gameBoard[row + 1][col - 1].equals("1")) {
                green++;
            }
        }
        if (isValidIndex(gameBoard, row + 1, col)) {
            if (gameBoard[row + 1][col].equals("1")) {
                green++;
            }
        }
        if (isValidIndex(gameBoard, row + 1, col + 1)) {
            if (gameBoard[row + 1][col + 1].equals("1")) {
                green++;
            }
        }
        return green;
    }

    private static boolean isValidIndex(String[][] field, int row, int col) {
        return row >= 0 && row < field.length && col >= 0 && col < field[row].length;
    }

}
