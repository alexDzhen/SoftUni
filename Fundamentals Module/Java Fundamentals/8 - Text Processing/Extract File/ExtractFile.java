import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] files = input.substring(input.lastIndexOf('\\') + 1).split("\\.");
        System.out.println("File name: " + files[0]);
        System.out.println("File extension: " + files[1]);
    }
}
