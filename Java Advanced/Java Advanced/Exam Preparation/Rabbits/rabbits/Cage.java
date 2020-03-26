package rabbits;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    private List<Rabbit> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(Rabbit rabbit) {
        if (this.capacity > this.data.size()) {
            this.data.add(rabbit);
        }
    }

    public boolean removeRabbit(String name) {
        int index = -1;
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                index = i;
                //this.data.remove(i);
                //return true;
            }
        }
        if (index != -1) {
            this.data.remove(index);
            return true;
        }
        return false;
    }

    public void removeSpecies(String species) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getSpecies().equals(species)) {
                indexes.add(i);
            }
        }
        for (int i = 0; i < indexes.size(); i++) {
            this.data.remove(indexes.get(i) - i);
        }
    }

    public Rabbit sellRabbit(String name) {
        Rabbit rabbit = null;
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getName().equals(name)) {
                this.data.get(i).setAvailable(false);
                rabbit = this.data.get(i);
                break;
            }
        }
        return rabbit;
    }

    public List<Rabbit> sellRabbitBySpecies(String species) {
        List<Rabbit> rabbits = new ArrayList<>();
        for (int i = 0; i < this.data.size(); i++) {
            Rabbit rabbit = this.data.get(i);
            if (rabbit.getSpecies().equals(species)) {
                rabbits.add(rabbit);
            }
        }
        return rabbits;
    }

    public int count() {
        return this.data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Rabbits available at %s:", this.name)).append(System.lineSeparator());
        for (Rabbit rabbit : this.data) {
             if (rabbit.isAvailable()) {
                 sb.append(rabbit.toString()).append(System.lineSeparator());
             }
        }
        return sb.toString().trim();
    }
}
