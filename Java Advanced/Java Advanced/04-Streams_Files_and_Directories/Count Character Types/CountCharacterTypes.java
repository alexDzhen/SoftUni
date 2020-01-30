import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class CountCharacterTypes {

    public static int[] counts = new int[3];

    public static void main(String[] args) throws IOException {
        String path = "resources2/input.txt";
        PrintWriter writer = new PrintWriter("resources2/output.txt");
        Scanner scanner = new Scanner(new File(path));
        String vowels = "aeiou";
        String punctuations = "!,.?";

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            Arrays.stream(line.split("\\s+"))
                    .forEach(str -> {
                        for (char symbol : str.toCharArray()) {
                            String currentString = String.valueOf(symbol);
                            if (vowels.contains(currentString)) {
                                counts[0]++;
                            } else if (punctuations.contains(currentString)) {
                                counts[2]++;
                            } else {
                                counts[1]++;
                            }
                        }
                    });
        }
        writer.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d", counts[0], counts[1], counts[2]);
        writer.close();
    }
}
