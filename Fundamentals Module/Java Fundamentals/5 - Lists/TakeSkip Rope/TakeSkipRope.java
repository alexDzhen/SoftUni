import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder takeSymbol = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                numbers.add(Character.getNumericValue(word.charAt(i)));
            } else {
                sb.append(word.charAt(i));
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numbers.get(i));
            } else {
                skipList.add(numbers.get(i));
            }
        }
        for (int i = 0; i < takeList.size(); i++) {
            if (takeList.get(i) > sb.length()) {
                takeList.set(i, sb.length());
            }
            takeSymbol.append(sb, 0, takeList.get(i));
            sb.delete(0, takeList.get(i));
            if (sb.length() > 0) {
                sb.delete(0, skipList.get(i));
            }
        }
        System.out.println(takeSymbol);
    }
}
