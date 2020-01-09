import java.util.*;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> rise = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        double firstSumTime = GetSumOfAllEtap(rise);
        Collections.reverse(rise);
        double secondSumTime = GetSumOfAllEtap(rise);
        String leftOrRight;
        double winningSum;
        if (firstSumTime <= secondSumTime) {
            leftOrRight = "left";
            winningSum = firstSumTime;
        } else {
            leftOrRight = "right";
            winningSum = secondSumTime;
        }
        System.out.printf("The winner is %s with total time: %.1f%n", leftOrRight, winningSum);
    }

    private static double GetSumOfAllEtap(List<Integer> rise) {
        int halfIndex = rise.size() / 2;
        double sum = 0.0;
        for (int i = 0; i < halfIndex; i++) {
            if (rise.get(i) == 0) {
                sum = sum * 0.8;
            } else {
                sum += rise.get(i);
            }
        }
        return sum;
    }
}
