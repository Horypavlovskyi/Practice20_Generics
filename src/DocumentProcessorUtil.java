public class DocumentProcessorUtil<T extends AbstractData & Storable> {
    static long ID_COUNTER;

    private DocumentProcessorUtil() {

    }

    StringData convert(T data) {
    return new StringData(ID_COUNTER,data.getType(),data);
    }

    static <T> void build(Storable storeObj, T data) {
        storeObj.write(data);
    }
}
