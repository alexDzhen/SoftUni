import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {
        String path = "E:\\SoftUni\\Software University\\SOFTWARE ENGINEERING\\Java Advanced\\Java Advanced\\Projects\\04 Streams Files and Directories\\Resources\\input.txt";
        String output = "E:\\SoftUni\\Software University\\SOFTWARE ENGINEERING\\Java Advanced\\Java Advanced\\Projects\\04 Streams Files and Directories\\Resources\\output.txt";

        try (FileInputStream fis = new FileInputStream(path);
             Scanner scanner = new Scanner(fis);
             PrintWriter printWriter = new PrintWriter(output);) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int oneInt = scanner.nextInt();
                    printWriter.println(oneInt);
                } else {
                    scanner.next();
                }
            }
        }

    }
}
