import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String path = "E:\\SoftUni\\Software University\\SOFTWARE ENGINEERING\\Java Advanced\\Java Advanced\\Projects\\04 Streams Files and Directories\\Resources\\input.txt";
        String output = "E:\\SoftUni\\Software University\\SOFTWARE ENGINEERING\\Java Advanced\\Java Advanced\\Projects\\04 Streams Files and Directories\\Resources\\output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path));
             PrintWriter pr = new PrintWriter(new FileOutputStream(output));) {
            String line = br.readLine();
            int counter = 1;
            while (line != null) {
                if (counter % 3 == 0) {
                    pr.println(line);
                }
                counter++;
                line = br.readLine();
            }
        }
    }
}
