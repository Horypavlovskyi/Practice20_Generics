public class StringData extends AbstractData {
    private Type type;
    private String data;

    public <T extends AbstractData & Storable> StringData(long id, Type type, T data) {
        super(id);
        this.type = type;
        this.data = data.toString();
    }
}
