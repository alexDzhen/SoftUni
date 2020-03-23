package comparing_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        String input;
        while (!"END".equals(input = scanner.nextLine())) {
            String[] tokens = input.split("\\s+");
            persons.add(new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
        }
        int index = Integer.parseInt(scanner.nextLine());
        int equal = 0;
        Person person = persons.get(index-1);
        for (Person current : persons) {
            if (person.compareTo(current) == 0) {
                equal++;
            }
        }
        if (equal > 1) {
            System.out.println(equal + " " + (persons.size() - equal) + " " + persons.size());
        } else {
            System.out.println("No matches");
        }
    }
}
