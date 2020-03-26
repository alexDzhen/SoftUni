import java.util.*;

public class TheGarden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        Character[][] field = new Character[rows][];
        for (int i = 0; i < rows; i++) {
            field[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(str -> str.charAt(0))
                    .toArray(Character[]::new);
        }
        Map<String, Integer> harvest = new LinkedHashMap<>();
        harvest.put("Carrots: ", 0);
        harvest.put("Potatoes: ", 0);
        harvest.put("Lettuce: ", 0);
        int harmed = 0;
        String input;
        while (!"End of Harvest".equals(input = scanner.nextLine())) {
            String[] tokens = input.split("\\s+");
            if ("Harvest".equals(tokens[0])) {
                harvest(field, Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), harvest);
            } else {
                harmed += mole(field, Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), tokens[3]);
            }
        }
        printField(field);
        for (Map.Entry<String, Integer> entry : harvest.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
        System.out.println("Harmed vegetables: " + harmed);
    }

    private static int mole(Character[][] field, int row, int col, String direction) {
        if (isOutOfBounds(field, row, col)) {
            return 0;
        }
        int harmed = 0;
        String veges = "LPC";
        if ("up".equals(direction)) {
            for (int i = row; i >= 0; i -= 2) {
                if (isInBound(field, i, col)) {
                    if (veges.contains(field[i][col] + "")) {
                        field[i][col] = ' ';
                        harmed++;
                    }
                }
            }
        } else if ("down".equals(direction)) {
            for (int i = row; i < field.length; i += 2) {
                if (isInBound(field, i, col)) {
                    if (veges.contains(field[i][col] + "")) {
                        field[i][col] = ' ';
                        harmed++;
                    }
                }
            }
        } else if ("right".equals(direction)) {
            for (int i = col; i < field[row].length; i += 2) {
                if (isInBound(field, row, i)) {
                    if (veges.contains(field[row][i] + "")) {
                        field[row][i] = ' ';
                        harmed++;
                    }
                }
            }
        } else if ("left".equals(direction)) {
            for (int i = col; i >= 0; i -= 2) {
                if (isInBound(field, row, i)) {
                    if (veges.contains(field[row][i] + "")) {
                        field[row][i] = ' ';
                        harmed++;
                    }
                }
            }
        }
        return harmed;
    }

    private static boolean isInBound(Character[][] field, int row, int col) {
        return !isOutOfBounds(field, row, col);
    }

    private static void printField(Character[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print(field[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void harvest(Character[][] field, int row, int col, Map<String, Integer> harvest) {
        if (isOutOfBounds(field, row, col)) {
            return;
        }
        if (field[row][col] == 'L') {
            field[row][col] = ' ';
            harvest.put("Lettuce: ", harvest.get("Lettuce: ") + 1);
        } else if (field[row][col] == 'P') {
            field[row][col] = ' ';
            harvest.put("Potatoes: ", harvest.get("Potatoes: ") + 1);
        } else if (field[row][col] == 'C') {
            field[row][col] = ' ';
            harvest.put("Carrots: ", harvest.get("Carrots: ") + 1);
        }
    }

    private static boolean isOutOfBounds(Character[][] field, int row, int col) {
        return row < 0 || row >= field.length || col < 0 || col >= field[row].length;
    }
}
