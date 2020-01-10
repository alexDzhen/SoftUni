import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstNums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> newList = new ArrayList<>();
        List<Integer> maxList = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();
        int firstNum = 0;
        int secondNum = 0;
        int last = 0;
        int previous = 0;
        if (firstNums.size() > secondNums.size()) {
            maxList = firstNums;
        } else {
            maxList = secondNums;
            Collections.reverse(maxList);
        }
        for (int i = 0; i < maxList.size(); i++) {
            last = maxList.get(maxList.size() - 1);
            previous = maxList.get(maxList.size() - 2);
        }
        for (int i = 0; i < firstNums.size(); i++) {
            newList.add(firstNums.get(i));
        }
        newList.remove((Object) previous);
        newList.remove((Object) last);
        for (int i = 0; i < secondNums.size(); i++) {
            newList.add(secondNums.get(i));
        }
        if (previous > last) {
            firstNum = last;
            secondNum = previous;
        } else {
            firstNum = previous;
            secondNum = last;
        }
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i) > firstNum && newList.get(i) < secondNum) {
                finalList.add(newList.get(i));
            }
        }
        Collections.sort(finalList);
        System.out.println(finalList.toString().replaceAll("[\\[\\],]", ""));
    }
}
