import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String command;
        while (!"3:1".equals(command = scanner.nextLine())) {
            String[] type = command.split("\\s+");
            switch (type[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(type[1]);
                    int endIndex = Integer.parseInt(type[2]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > input.size() - 1) {
                        endIndex = input.size() - 1;
                    }
                    int counter = startIndex;
                    for (int i = startIndex; i < endIndex; i++) {
                        String concat = input.get(counter) + input.get(counter + 1);
                        input.set(counter, concat);
                        input.remove(counter + 1);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(type[1]);
                    int part = Integer.parseInt(type[2]);
                    if (index >= 0 && index < input.size() && part >= 0 && part <= 100) {
                        String element = input.get(index);
                        List<String> newList = new ArrayList<>();
                        if (element.length() % part == 0) {
                            int portionLength = element.length() / part;
                            int count = 0;
                            for (int i = 0; i < part; i++) {
                                String concat = "";
                                for (int j = 0; j < portionLength; j++) {
                                    char symbol = element.charAt(count);
                                    concat += symbol;
                                    count++;
                                }
                                newList.add(concat);
                            }
                        } else {
                            int portionLength = element.length() / part;
                            int count = 0;
                            for (int i = 0; i < part; i++) {
                                String concat = "";
                                if (i == part - 1) {
                                    for (int j = count; j < element.length(); j++) {
                                        char symbol = element.charAt(count);
                                        concat += symbol;
                                        count++;
                                    }
                                } else {
                                    for (int j = 0; j < portionLength; j++) {
                                        char symbol = element.charAt(count);
                                        concat += symbol;
                                        count++;
                                    }
                                }
                                newList.add(concat);
                            }
                        }
                        input.remove(index);
                        input.addAll(index, newList);
                    }
                    break;
            }
        }
        for (String item : input) {
            System.out.printf("%s ", item);
        }
    }
}
