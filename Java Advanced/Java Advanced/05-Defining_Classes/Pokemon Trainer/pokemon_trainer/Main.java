package pokemon_trainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Trainer> trainers = new LinkedHashMap<>();
        String input;
        while (!"Tournament".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+");
            String trainerName = data[0];
            String pokemonName = data[1];
            String element = data[2];
            int health = Integer.parseInt(data[3]);
            Pokemon pokemon = new Pokemon(pokemonName, element, health);
            trainers.putIfAbsent(trainerName, new Trainer());
            trainers.get(trainerName).addPokemon(pokemon);
        }
        String command;
        while (!"End".equals(command = reader.readLine())) {
            for (Map.Entry<String, Trainer> entry : trainers.entrySet()) {
                if (entry.getValue().pokeCollectionSize() > 0) {
                    boolean havePokemon = false;
                    for (Pokemon pokemon : entry.getValue().getPokemons()) {
                        if (pokemon.getElement().equals(command)) {
                            havePokemon = true;
                            entry.getValue().setBadges();
                            break;
                        }
                    }
                    if (!havePokemon) {
                        entry.getValue().missingPokemonPenalty();
                    }
                }
            }
        }
        trainers.entrySet().stream()
                .sorted((b1, b2) -> Integer.compare(b2.getValue().getBadges(), b1.getValue().getBadges()))
                .forEach(t -> {
                    System.out.println(String.format("%s %s %s", t.getKey(), t.getValue().getBadges(), t.getValue().pokeCollectionSize()));
                });
    }
}
