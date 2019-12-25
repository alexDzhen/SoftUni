import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeoples = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;
        double totalPrice = 0.0;

        switch (day) {
            case "Friday":
                switch (type) {
                    case "Students":
                        price = 8.45;
                        break;
                    case "Business":
                        price = 10.90;
                        break;
                    case "Regular":
                        price = 15.00;
                        break;
                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        price = 9.80;
                        break;
                    case "Business":
                        price = 15.60;
                        break;
                    case "Regular":
                        price = 20.00;
                        break;
                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        price = 10.46;
                        break;
                    case "Business":
                        price = 16.00;
                        break;
                    case "Regular":
                        price = 22.50;
                        break;
                }
                break;
        }
        if ("Students".equals(type) && numPeoples >= 30){
            totalPrice = (numPeoples * price) * 0.85;
        }else if ("Business".equals(type) && numPeoples >= 100){
            numPeoples -= 10;
            totalPrice = numPeoples * price;
        }else if ("Regular".equals(type) && numPeoples >= 10 && numPeoples <= 20){
            totalPrice = (numPeoples * price) * 0.95;
        }else {
            totalPrice = numPeoples * price;
        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
