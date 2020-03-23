package comparing_objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person other) {
        int index = this.name.compareTo(other.name);
        if (index == 0) {
            index = Integer.compare(this.age, other.age);
        }
        if (index == 0) {
            index = this.town.compareTo(other.town);
        }
        return index;
    }
}
