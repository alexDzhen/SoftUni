import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightsaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());
        double lightsabers = ((Math.ceil(students * 0.10)) + students) * priceLightsaber;
        double robes = students * priceRobe;
        double belts = 0.0;
        if (students >= 6) {
            double extraBelts = Math.floor(students / 6);
            belts = (students - extraBelts) * priceBelt;
        } else {
            belts = students * priceBelt;
        }
        double total = lightsabers + robes + belts;
        double needed = total - money;
        if (total <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        }else {
            System.out.printf("Ivan Cho will need %.2flv more.", needed);
        }
    }
}