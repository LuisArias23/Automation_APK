package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataHelper {
    private static Properties properties;

    static {
        properties = new Properties();
        try (InputStream input = DataHelper.class.getClassLoader().getResourceAsStream("data/testdata.properties")) {
            if (input != null) {
                properties.load(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
    public static int getInt(String key) {
        String value = properties.getProperty(key);
        if (value == null || value.trim().isEmpty()) {
            return 0; // Valor por defecto en caso de que esté vacío en el archivo
        }
        return Integer.parseInt(value.trim()); // Convierte "123" en 123
    }
}
