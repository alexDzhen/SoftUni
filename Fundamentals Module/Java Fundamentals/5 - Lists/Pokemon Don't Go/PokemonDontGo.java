import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pokemons = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (!pokemons.isEmpty()) {
            int ind = Integer.parseInt(scanner.nextLine());
            if (ind >= 0 && ind <= pokemons.size() - 1) {
                int element = pokemons.get(ind);
                sum += element;
                pokemons.remove(ind);
                changeListContent(pokemons, element);
            } else if (ind < 0) {
                int element = pokemons.get(0);
                sum += element;
                pokemons.set(0, pokemons.get(pokemons.size() - 1));
                changeListContent(pokemons, element);
            } else {
                int element = pokemons.get(pokemons.size() - 1);
                sum += element;
                pokemons.set((pokemons.size() - 1), pokemons.get(0));
                changeListContent(pokemons, element);
            }
        }
        System.out.println(sum);
    }

    private static void changeListContent(List<Integer> pokemons, int element) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i) <= element) {
                pokemons.set(i, pokemons.get(i) + element);
            } else {
                pokemons.set(i, pokemons.get(i) - element);
            }
        }
    }
}
