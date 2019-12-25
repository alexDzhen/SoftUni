import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double maxV = 0.0;
        String maxModel = "";
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double r = Double.parseDouble(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());
            double v = Math.PI * r * r * h;
            if (v > maxV) {
                maxV = v;
                maxModel = model;
            }
        }
        System.out.println(maxModel);
    }
}
