public class BinaryData extends AbstractData implements Storable<Byte>{
    Type type = Type.BIN;
    private byte[] binaryData;
    public BinaryData(long id) {
        super(id);
    }

    @Override
    public Byte read() {
        return null;
    }

    @Override
    public void write(Byte data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
