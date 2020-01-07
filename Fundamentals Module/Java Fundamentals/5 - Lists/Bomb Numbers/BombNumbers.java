import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
//        int[] bomb = new int[2];
//        String[] s = scanner.nextLine().split("\\s+");
//        for (int i = 0; i < s.length; i++) {
//            bomb[i]=Integer.parseInt(s[i]);
//        }  same as bomb info
        List<Integer> bombInfo = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int bombNumber = bombInfo.get(0);
        int bombPower = bombInfo.get(1);
        while (list.contains(bombNumber)) {
            int bombPosition = list.indexOf(bombNumber);
            int leftBound = Math.max(0, bombPosition - bombPower);
            int rightBound = Math.min(list.size() - 1, bombPosition + bombPower);
            for (int i = rightBound; i >= leftBound; i--) {
                list.remove(i);
            }
        }
//        int sum = 0;
//        for (int i = 0; i < list.size(); i++) {
//            sum +=list.get(i);
//        }
//        System.out.println(sum);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
