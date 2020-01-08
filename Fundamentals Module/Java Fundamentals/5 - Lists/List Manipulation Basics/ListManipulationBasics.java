import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String line;
        while (!"end".equals(line = scanner.nextLine())){
            String[] input = line.split("\\s+");
            String command = input[0];
            switch (command){
                case "Add":
                    int numberToAdd = Integer.parseInt(input[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(input[1]);
                    numbers.remove((Object)numberToRemove);
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(input[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(input[1]);
                    int indexToInsert = Integer.parseInt(input[2]);
                    numbers.add(indexToInsert, numberToInsert);
                    break;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
