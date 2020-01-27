import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String path = "E:\\SoftUni\\Software University\\SOFTWARE ENGINEERING\\Java Advanced\\Java Advanced\\Projects\\04 Streams Files and Directories\\Resources\\input.txt";
        String output = "E:\\SoftUni\\Software University\\SOFTWARE ENGINEERING\\Java Advanced\\Java Advanced\\Projects\\04 Streams Files and Directories\\Resources\\output.txt";
        List<String> allLines = Files.lines(Path.of(path)).sorted().collect(Collectors.toList());
        Files.write(Path.of(output), allLines);
    }
}
