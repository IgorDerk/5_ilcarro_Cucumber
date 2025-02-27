package ilcarro.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

    public static String loadProperty(String name) {
        Properties props = new Properties();
        try {
            // Подгружаем файл selenide.properties
            props.load(PropertiesLoader.class.getResourceAsStream("/selenide.properties"));
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при загрузке файла свойств: " + e.getMessage());
        }
        // Возвращаем значение по ключу
        return props.getProperty(name, "");
    }
}