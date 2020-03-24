import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static class Person {
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberOfPeople = scanner.nextLine().trim();
        int ppl = Integer.parseInt(numberOfPeople);
        List<Person> peopleList = new ArrayList<>();
        for (int i = 0; i < ppl; i++) {
            String personLine = scanner.nextLine();
            String[] split = personLine.split(", ");
            Person person = new Person(Integer.parseInt(split[1].trim()), split[0]);
            peopleList.add(person);
        }
        String condition = scanner.nextLine().trim();
        int conditionAge = Integer.parseInt(scanner.nextLine().trim());
        Predicate<Person> personPredicate = getPersonPredicate(condition, conditionAge);
        String printCondition = scanner.nextLine().trim();
        Consumer<Person> personPrinter = getPersonPrinter(printCondition);
        peopleList.stream()
                .filter(personPredicate)
                .forEach(personPrinter);
    }

    private static Consumer<Person> getPersonPrinter(String printCondition) {
        switch (printCondition) {
            case "age":
                return (person -> System.out.println(person.getAge()));
            case "name":
                return (person -> System.out.println(person.getName()));
            default:
                return (person -> System.out.println(person.getName() + " - " + person.getAge()));
        }
    }

    private static Predicate<Person> getPersonPredicate(String condition, int conditionAge) {
        Predicate<Person> personPredicate;
        if ("younger".equals(condition)) {
            personPredicate = (person) -> person.getAge() <= conditionAge;
        } else {
            personPredicate = (person) -> person.getAge() >= conditionAge;
        }
        return personPredicate;
    }
}
