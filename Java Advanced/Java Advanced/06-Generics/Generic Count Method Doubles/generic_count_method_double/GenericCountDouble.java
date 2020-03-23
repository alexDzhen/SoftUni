package generic_count_method_double;

public class GenericCountDouble <T extends Comparable<T>> implements Comparable<GenericCountDouble<T>> {
    private T value;

    public GenericCountDouble(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(GenericCountDouble<T> other) {
        return this.value.compareTo(other.value);
    }

}
