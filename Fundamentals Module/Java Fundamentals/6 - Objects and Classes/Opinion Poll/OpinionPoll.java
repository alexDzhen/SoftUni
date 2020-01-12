import java.util.*;

public class OpinionPoll {
    String name;
    int age;

    OpinionPoll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPersons = Integer.parseInt(scanner.nextLine());
        List<OpinionPoll> people = new ArrayList<>();
        for (int i = 0; i < numPersons; i++) {
            String[] info = scanner.nextLine().split(" ");
            String name = info[0];
            int age = Integer.parseInt(info[1]);
            if (age > 30) {
                OpinionPoll person = new OpinionPoll(name, age);
                people.add(person);
            }
        }
        people.stream().sorted((a1, a2) -> a1.getName().compareTo(a2.getName())).forEach(e -> System.out.println(e));
    }
}
