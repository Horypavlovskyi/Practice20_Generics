public class XmlData extends AbstractData implements Storable<String>{
    Type type = Type.XML;
    private String dataXml;
    public XmlData(long id) {
        super(id);
    }

    @Override
    public String read() {
        return null;
    }

    @Override
    public void write(String data) {

    }

    @Override
    public Type getType() {
        return null;
    }
}
