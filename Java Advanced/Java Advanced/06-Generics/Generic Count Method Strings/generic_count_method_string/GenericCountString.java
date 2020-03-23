package generic_count_method_string;

public class GenericCountString<T extends Comparable<T>> implements Comparable<GenericCountString<T>> {
    private T value;

    public GenericCountString(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(GenericCountString<T> other) {
        return this.value.compareTo(other.value);
    }

}
