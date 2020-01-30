import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class NestedFolders {
    public static void main(String[] args) {
        String path = "E:\\SoftUni\\Software University\\SOFTWARE ENGINEERING\\Java Advanced\\Java Advanced\\04 Streams, Files and Directories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";
        File dir = new File(path);
        ArrayDeque<File> stack = new ArrayDeque<>();
        stack.offer(dir);
        List<String> fileNames = new ArrayList<>();
        while (!stack.isEmpty()) {
            File file = stack.poll();
            fileNames.add(file.getName());
            File[] currentFolderContend = file.listFiles();
            for (File listFile : currentFolderContend) {
                if (listFile.isDirectory()) {
                    stack.offer(listFile);
                }
            }
        }
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
        System.out.println(fileNames.size() + " folders");
    }
}
