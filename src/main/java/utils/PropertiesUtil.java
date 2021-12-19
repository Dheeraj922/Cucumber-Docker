package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    private static Properties pFile;

    private static void readPropertiesFile() {
        FileReader reader = null;
        try {
            reader = new FileReader("src/main/resources/configs/app.properties");
            pFile = new Properties();
            pFile.load(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public static String getAppProperty(String property) {
        readPropertiesFile();
        return pFile.getProperty(property);
    }

}
