package generic_box;

public class GenericBox {
    private Object value;

    public GenericBox(Object value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value
                .getClass()
                .getName()
                + ": "+ value;
    }
}
