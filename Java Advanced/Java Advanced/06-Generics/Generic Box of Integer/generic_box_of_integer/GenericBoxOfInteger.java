package generic_box_of_integer;

public class GenericBoxOfInteger <T> {
    private T value;

    public GenericBoxOfInteger(T value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value.getClass().getName()+": "+value;
    }
}
