/**
 * 4. Создать классы NumericData, BinaryData, XmlData.
 * • Отнаследовать классы от AbstractData
 * • Для всех классов создать константное значение с типом (из enum-а Type)
 * • Для всех классов добавить поля data (но для каждого с разным типом)
 * • XmlData – строка с xml
 * • BinaryData – массив байтов
 * • NumericData – абстрактный числовой тип (Number)
 * • Реализовать интерфейс Storable<класс>
 */

import java.util.Arrays;

public class XmlData extends AbstractData implements Storable<String>{
    Type type = Type.XML;
    private String dataXml;
    public XmlData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return String.valueOf(dataXml);
    }

    @Override
    public String read() {
        return dataXml;
    }

    @Override
    public void write(String data) {
    this.dataXml = data;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "XmlData{" +
                "type=" + type +
                ", dataXml='" + dataXml + '\'' +
                '}';
    }
}
