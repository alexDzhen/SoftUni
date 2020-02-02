package google;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Person> people = new HashMap<>();
        String input;
        while (!"End".equals(input = reader.readLine())) {
            String[] tokens = input.split("\\s+");
            String personName = tokens[0];
            if (!people.containsKey(personName)) {
                Person person = new Person(personName);
                people.put(personName, person);
            }
            String type = tokens[1];
            String value1 = tokens[2];
            String value2 = tokens[3];
            archive(people, tokens, personName, type, value1, value2);
        }
        String printInfoThisPerson = reader.readLine();
        reader.close();
        System.out.println(people.get(printInfoThisPerson));
    }

    private static void archive(Map<String, Person> people, String[] tokens, String personName, String type, String value1, String value2) {
        if ("company".equals(type)) {
            double salary = Double.parseDouble(tokens[4]);
            Company currentCompany = new Company(value1, value2, salary);
            people.get(personName).setCompany(currentCompany);
        } else if ("pokemon".equals(type)) {
            Pair<String, String> currentPokemonNameType = new Pair<>(value1, value2);
            people.get(personName).getPokemonNameType().add(currentPokemonNameType);
        } else if ("parents".equals(type)) {
            Pair<String, String> currentParent = new Pair<>(value1, value2);
            people.get(personName).getParentsNameBirthday().add(currentParent);
        } else if ("children".equals(type)) {
            Pair<String, String> currentChild = new Pair<>(value1, value2);
            people.get(personName).getChildrenNameBirthday().add(currentChild);
        } else if ("car".equals(type)) {
            Pair<String, String> carModelSpeed = new Pair<>(value1, value2);
            people.get(personName).setCarNameSpeed(carModelSpeed);
        }
    }
}
