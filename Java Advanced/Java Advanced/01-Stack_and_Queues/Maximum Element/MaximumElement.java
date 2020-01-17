import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandCount = scanner.nextInt();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < commandCount; i++) {
            int command = scanner.nextInt();
            if (command==1){
                int numToPush = scanner.nextInt();
                stack.push(numToPush);
            }else if (command==2){
                stack.pop();
            }else {
                int max = Integer.MIN_VALUE;
                for (Integer currentNum : stack) {
                    if (currentNum>max){
                        max=currentNum;
                    }
                }
                System.out.println(max);
            }
        }
    }
}
