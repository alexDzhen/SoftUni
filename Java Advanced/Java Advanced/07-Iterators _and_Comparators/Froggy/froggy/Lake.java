package froggy;

import java.util.Iterator;

public class Lake implements Iterable<Integer> {
    private Integer[] stones;

    public Lake(Integer... stone) {
        this.stones = stone;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < stones.length;
            }

            @Override
            public Integer next() {
                Integer element = stones[index];
                if (stones.length % 2 == 0 && index == stones.length - 2) {
                    index = -1;
                } else if (stones.length % 2 != 0 && index == stones.length - 1) {
                    index = -1;
                }
                index += 2;
                return element;
            }
        };
    }
}
