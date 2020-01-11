import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<Double>> map = new LinkedHashMap<>();
        int pairs = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < pairs; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(grade);
        }
        map.entrySet().stream()
                .filter(e -> average(e) >= 4.5)
                .sorted(Comparator.comparingDouble(StudentAcademy::average).reversed())
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), average(entry)));
    }

    private static double average(Map.Entry<String, List<Double>> entry) {
        return entry.getValue().stream().mapToDouble(d -> d).average().orElse(0.0);
    }
}
