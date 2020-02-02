package google;

import javafx.util.Pair;
import pokemon_trainer.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pair<String, String>> pokemonNameType;
    private List<Pair<String, String>> parentsNameBirthday;
    private List<Pair<String, String>> childrenNameBirthday;
    private Pair<String, String> carNameSpeed;

    public Person(String name) {
        this.name = name;
        this.pokemonNameType = new ArrayList<>();
        this.parentsNameBirthday = new ArrayList<>();
        this.childrenNameBirthday = new ArrayList<>();
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pair<String, String>> getPokemonNameType() {
        return this.pokemonNameType;
    }

    public List<Pair<String, String>> getParentsNameBirthday() {
        return this.parentsNameBirthday;
    }

    public List<Pair<String, String>> getChildrenNameBirthday() {
        return this.childrenNameBirthday;
    }

    public void setCarNameSpeed(Pair<String, String> carNameSpeed) {
        this.carNameSpeed = carNameSpeed;
    }

    private String getPairs(List<Pair<String, String>> pairList) {
        StringBuilder sb = new StringBuilder();
        for (Pair pair : pairList) {
            sb.append(pair.getKey()).append(" ").append(pair.getValue()).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(System.lineSeparator());
        sb.append("Company:").append(System.lineSeparator());
        if (this.company != null) {
            sb.append(this.company.toString()).append(System.lineSeparator());
        }
        sb.append("Car:").append(System.lineSeparator());
        if (this.carNameSpeed != null) {
            sb.append(this.carNameSpeed.getKey()).append(" ").append(this.carNameSpeed.getValue()).append(System.lineSeparator());
        }
        sb.append("Pokemon:").append(System.lineSeparator());
        sb.append(getPairs(this.pokemonNameType));
        sb.append("Parents:").append(System.lineSeparator());
        sb.append(getPairs(this.parentsNameBirthday));
        sb.append("Children:").append(System.lineSeparator());
        sb.append(getPairs(this.childrenNameBirthday)).append(System.lineSeparator());
        return sb.toString();
    }
}
