package generic_swap_method_integer;

public class GBoxInteger<T> {
    private T value;

    public GBoxInteger(T value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value.getClass().getName()+": "+value;
    }
}
