import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        String path = "resources2/input.txt";
        long sum = 0;
        for (byte byt : Files.readAllBytes(Path.of(path))) {
            if (byt != 10 && byt != 13) {
                sum += byt;
            }
        }
        System.out.println(sum);
    }
}
