import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "E:\\SoftUni\\Software University\\SOFTWARE ENGINEERING\\Java Advanced\\Java Advanced\\Projects\\04 Streams Files and Directories\\Resources\\input.txt";
        String output = "E:\\SoftUni\\Software University\\SOFTWARE ENGINEERING\\Java Advanced\\Java Advanced\\Projects\\04 Streams Files and Directories\\Resources\\output.txt";
        FileInputStream fis = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream(output);
        List<Character> punctuation = List.of(',', '!', '?', '.');
        int oneByte = fis.read();
        while (oneByte != -1) {
             if (!punctuation.contains((char) oneByte)){
                 fos.write(oneByte);
             }
            oneByte = fis.read();
        }
    }
}
