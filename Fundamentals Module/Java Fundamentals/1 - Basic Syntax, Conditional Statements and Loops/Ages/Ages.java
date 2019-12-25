import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String kind = "";
        if (0 <= age && age < 3){
            kind = "baby";
        }else if (3 <= age && age < 14){
            kind = "child";
        }else if (14 <= age && age < 20){
            kind = "teenager";
        }else if (20 <= age && age < 66){
            kind = "adult";
        }else if (66 <= age){
            kind = "elder";
        }
        System.out.println(kind);
    }
}
