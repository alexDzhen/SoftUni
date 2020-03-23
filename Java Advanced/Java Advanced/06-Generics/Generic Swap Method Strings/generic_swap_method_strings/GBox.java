package generic_swap_method_strings;

public class GBox<T> {
    private T value;

    public GBox(T value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value.getClass().getName()+": "+value;
    }
}
