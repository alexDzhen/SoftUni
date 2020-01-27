import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String path = "E:\\SoftUni\\Software University\\SOFTWARE ENGINEERING\\Java Advanced\\Java Advanced\\Projects\\04 Streams Files and Directories\\Resources\\input.txt";
        String output = "E:\\SoftUni\\Software University\\SOFTWARE ENGINEERING\\Java Advanced\\Java Advanced\\Projects\\04 Streams Files and Directories\\Resources\\output.txt";
        FileInputStream fis = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream(output);
        int space = ' ';
        int newLine = '\n';
        int oneByte = fis.read();
        while (oneByte != -1) {
            String stringNumbers = String.valueOf(oneByte);
            if (oneByte == space || oneByte == newLine) {
                fos.write(oneByte);
            } else {
                for (int i = 0; i < stringNumbers.length(); i++) {
                    fos.write(stringNumbers.charAt(i));
                }
            }
            oneByte = fis.read();
        }
    }
}
