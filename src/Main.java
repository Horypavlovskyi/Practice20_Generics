/**
 * 6. Создать класс Main
 * • Создать psvm
 * • Создать экземпляры классов XmlData, BinaryData, NumericData ()
 * • В качестве id передать инкрементное значение счетчика ID_COUNTER
 * • Подготовить данные для объектов:
 * XmlData – “ <?xml version="1.0"?><Tests>qwerty</Tests>”
 * BinaryData – получить массив байт из тестовой строки «Данные в байтах»
 * NumericData – любое число например Double d = 123.456789;
 * • С помощью метода DocumentProcessorUtil.build() объединить данные с
 * обьектом.
 * • С помощью метода DocumentProcessorUtil. convert(); преобразовать
 * первоначальные объекты в StringData
 * • Вывести данные из всех полученных StringData на экран.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        XmlData xmlData = new XmlData(DocumentProcessorUtil.ID_COUNTER++);
        BinaryData binaryData = new BinaryData(DocumentProcessorUtil.ID_COUNTER++);
        NumericData numericData = new NumericData(DocumentProcessorUtil.ID_COUNTER++);

        String xmlData2 = "<?xml version=\"1.0\"?><Tests>qwerty</Tests>";
        byte[] binary = "Данные в байтах".getBytes();
        Byte[] bytes = new Byte[binary.length];
        int count = 0;
        for (Byte b : binary) {
            bytes[count++] = b;
        }
        Double d = 123.456789;

        DocumentProcessorUtil.build(xmlData,xmlData2);
        DocumentProcessorUtil.build(binaryData,bytes);
        DocumentProcessorUtil.build(numericData,d);

        System.out.println(DocumentProcessorUtil.convert(xmlData));
        System.out.println(DocumentProcessorUtil.convert(binaryData));
        System.out.println(DocumentProcessorUtil.convert(numericData));

    }
}
