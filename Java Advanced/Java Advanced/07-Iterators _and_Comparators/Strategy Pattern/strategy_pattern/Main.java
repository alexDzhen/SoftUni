package strategy_pattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<Person> byName = new TreeSet<>(new PersonComparatorByName());
        Set<Person> byAge = new TreeSet<>(new PersonComparatorByAge());
        for (int i = n; i > 0; i--) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(name, age);
            byName.add(person);
            byAge.add(person);
        }
        byName.forEach(System.out::println);
        byAge.forEach(System.out::println);
    }
}
