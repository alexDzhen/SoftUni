import java.util.Scanner;

public class Articles {
    String title;
    String content;
    String author;

    Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articleInfo = scanner.nextLine().split(",\\s+");
        String title = articleInfo[0];
        String content = articleInfo[1];
        String author = articleInfo[2];
        Articles article = new Articles(title, content, author);
        int numIn = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numIn; i++) {
            String[] input = scanner.nextLine().split(": ");
            String command = input[0];
            String line = input[1];
            switch (command) {
                case "Edit":
                    article.edit(line);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(line);
                    break;
                case "Rename":
                    article.rename(line);
                    break;
            }
        }
        System.out.println(article);
    }
}
