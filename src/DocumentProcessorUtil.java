/**
 * 5. Создать класс DocumentProcessorUtil
 * • Создать статическое поле ID_COUNTER, для реализации счетчика id
 * • Создать приватный конструктор.
 * • Создать метод StringData convert(T data);
 * Generic: <T extends AbstractData & Storable>
 * • В методе необходимо создать и вернуть экземпляр класса StringData.
 * • В качестве id передать инкрементное значение счетчика
 * • В качестве значения типа – вызвать метод getType();
 * • В качестве значения данных - data
 * • Создать статический метод <T> void build(Storable storeObj, T data);
 * • Внутри метода «записать» входящие данные в объект storeObj (метод write() )
 */

public class DocumentProcessorUtil {
    static long ID_COUNTER;

    private DocumentProcessorUtil() {

    }

    static <T extends AbstractData & Storable>StringData convert(T data) {
    return new StringData(ID_COUNTER++,data.getType(),data);
    }

    static <T> void build(Storable storeObj, T data) {
        storeObj.write(data);
    }
}
