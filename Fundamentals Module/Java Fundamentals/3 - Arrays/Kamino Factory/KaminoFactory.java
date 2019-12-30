import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthDNA = Integer.parseInt(scanner.nextLine());
        String input;
        int lineCount = 0;
        int bestStartIndex = Integer.MAX_VALUE;
        int[] bestLine = new int[lengthDNA];
        int bestLineNum = 0;
        int bestOnes = 0;
        int bestSum = 0;
        int sum = 0;
        while (!"Clone them!".equals(input = scanner.nextLine())) {
            int[] currentLine = Arrays.stream(input.split("!+")).mapToInt(Integer::parseInt).toArray();
            lineCount++;
            int longestOnes = 0;
            int startIndex = Integer.MAX_VALUE;
            for (int i = 0; i < currentLine.length; i++) {
                int onesInARow = 0;
                for (int j = i; j < currentLine.length; j++) {
                    if (currentLine[i] == currentLine[j] && currentLine[i] == 1) {
                        onesInARow++;
                        if (onesInARow > longestOnes) {
                            longestOnes = onesInARow;
                            startIndex = i;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (longestOnes > bestOnes) {
                bestOnes = longestOnes;
                bestLine = currentLine;
                bestLineNum = lineCount;
                bestStartIndex = startIndex;
            } else if (longestOnes == bestOnes) {
                if (startIndex < bestStartIndex) {
                    bestLine = currentLine;
                    bestLineNum = lineCount;
                    bestStartIndex = startIndex;
                } else if (startIndex == bestStartIndex) {
                    for (int i = 0; i < bestLine.length; i++) {
                        bestSum += bestLine[i];
                    }
                    for (int i = 0; i < currentLine.length; i++) {
                        sum += currentLine[i];
                    }
                    if (sum > bestSum) {
                        bestLine = currentLine;
                        bestLineNum = lineCount;
                        bestSum = sum;
                    }
                }
            }
        }
        bestSum = 0;
        for (int i = 0; i < bestLine.length; i++) {
            bestSum += bestLine[i];
        }
        if (bestSum == 0) {
            bestLineNum = 1;
        }
        System.out.println(String.format("Best DNA sample %d with sum: %d.", bestLineNum, bestSum));
        for (int i = 0; i < bestLine.length; i++) {
            System.out.print(bestLine[i] + " ");
        }
    }
}
