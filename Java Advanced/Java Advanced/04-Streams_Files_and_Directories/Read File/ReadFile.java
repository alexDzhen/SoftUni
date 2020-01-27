import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "E:\\SoftUni\\Software University\\SOFTWARE ENGINEERING\\Java Advanced\\Java Advanced\\Projects\\04 Streams Files and Directories\\Resources\\input.txt";
        FileInputStream fis = new FileInputStream(path);
        int oneByte = fis.read();
        while (oneByte != -1) {
            System.out.print(Integer.toBinaryString(oneByte) + " ");
            oneByte = fis.read();
        }
    }
}
