import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        String path = "Resources/Files-and-Streams";
        File filesAndStreamsDir = new File(path);
        for (File file : filesAndStreamsDir.listFiles()) {
            if (file.isFile()) {
                System.out.println(String.format("%s: [%d]", file.getName(), file.length()));
            }

        }
    }
}
