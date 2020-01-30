import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MergeTwoFiles {
    public static void main(String[] args) throws FileNotFoundException {
        String pathOne = "resources2/inputOne.txt";
        String pathTwo = "resources2/inputTwo.txt";
        Scanner scanner = new Scanner(new File(pathOne));
        PrintWriter writer = new PrintWriter("resources2/results.txt");
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            writer.append(line).append(System.lineSeparator());
        }
        scanner = new Scanner(new File(pathTwo));
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            writer.append(line).append(System.lineSeparator());
        }
        writer.close();
    }
}
