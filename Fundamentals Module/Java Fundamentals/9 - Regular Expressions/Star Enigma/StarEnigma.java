import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexCrypt = "[SsTtAaRr]";
        String regexMessage = "@(?<planet>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attack>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)";
        Pattern patternCrypt = Pattern.compile(regexCrypt);
        Pattern patternMessage = Pattern.compile(regexMessage);
        ArrayList<String> attackedPlanets = new ArrayList<>();
        ArrayList<String> destroyedPlanets = new ArrayList<>();
        int numberOfMessages = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfMessages; i++) {
            String message = scanner.nextLine();
            Matcher matcherCrypt = patternCrypt.matcher(message);
            int countCrypt = 0;
            while (matcherCrypt.find()) {
                countCrypt++;
            }
            String encryptMessage = encrypt(message, countCrypt);
            Matcher matcherEncrypt = patternMessage.matcher(encryptMessage);
            if (matcherEncrypt.find()) {
                String planet = matcherEncrypt.group("planet");
                String attackType = matcherEncrypt.group("attack");
                if (attackType.equals("A")) {
                    attackedPlanets.add(planet);
                } else {
                    destroyedPlanets.add(planet);
                }
            }
        }
        System.out.println("Attacked planets: " + attackedPlanets.size());
        if (attackedPlanets.size() > 0) {
            Collections.sort(attackedPlanets);
            for (String planet : attackedPlanets) {
                System.out.println("-> " + planet);
            }
        }
        System.out.println("Destroyed planets: " + destroyedPlanets.size());
        if (destroyedPlanets.size() > 0) {
            Collections.sort(destroyedPlanets);
            for (String planet : destroyedPlanets) {
                System.out.println("-> " + planet);
            }
        }
    }

    private static String encrypt(String message, int key) {
        char[] messageChars = message.toCharArray();
        for (int i = 0; i < messageChars.length; i++) {
            messageChars[i] -= key;
        }
        return new String(messageChars);
    }
}
