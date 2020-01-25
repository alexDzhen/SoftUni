import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<Double>> students = new TreeMap<>();
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            String[] command = scanner.nextLine().split(" ");
            String name = command[0];
            double grade = Double.parseDouble(command[1]);
            students.putIfAbsent(name, new ArrayList<Double>());
            students.get(name).add(grade);
        }
        for (Map.Entry<String, ArrayList<Double>> entry : students.entrySet()) {
            double avg = 0.0;
            System.out.print(String.format("%s -> ", entry.getKey()));
            for (Double v : entry.getValue()) {
                avg += v;
                System.out.print(String.format("%.2f ", v));
            }
            avg /= entry.getValue().size();
            System.out.println(String.format("(avg: %.2f)", avg));
        }
    }
}
