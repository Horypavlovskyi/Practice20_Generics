public class NumericData extends AbstractData implements Storable<Number>{
    Type type = Type.NUM;
    private Number numericData;
    public NumericData(long id) {
        super(id);
    }

    @Override
    public Number read() {
        return null;
    }

    @Override
    public void write(Number data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
