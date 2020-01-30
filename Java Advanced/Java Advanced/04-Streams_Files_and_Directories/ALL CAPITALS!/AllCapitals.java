import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.*;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String path = "resources2/input.txt";
        FileOutputStream outputStream = new FileOutputStream("resources2/output.txt");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        Files.readAllLines(Path.of(path))
                .forEach(str -> {
                    try {
                        writer.write(str.toUpperCase());
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        writer.close();
    }
}
