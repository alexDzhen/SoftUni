import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Students2(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students2> students = new ArrayList<>();
        String line;
        while (!"end".equals(line = scanner.nextLine())) {
            String[] tokens = line.split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];
            if (IsStudentExisting(students, firstName, lastName)) {
                Students2 student = getStudent(students, firstName, lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setCity(city);
            } else {
                Students2 student = new Students2(firstName, lastName, age, city);
                students.add(student);
            }
        }
        String filterCity = scanner.nextLine();
        for (Students2 student : students) {
            if (student.getCity().equals(filterCity)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge(), student.getCity());
            }
        }
    }

    private static Students2 getStudent(List<Students2> students, String firstName, String lastName) {
        Students2 existingStudent = null;
        for (Students2 student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static boolean IsStudentExisting(List<Students2> students, String firstName, String lastName) {
        for (Students2 student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}