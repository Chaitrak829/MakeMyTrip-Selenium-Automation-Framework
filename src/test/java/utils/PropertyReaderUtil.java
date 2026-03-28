package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderUtil {
	
	private static Properties prop;

    public static String getProperty(String key) throws IOException {

        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");

        prop = new Properties();
        prop.load(fis);

        return prop.getProperty(key);

}
}
