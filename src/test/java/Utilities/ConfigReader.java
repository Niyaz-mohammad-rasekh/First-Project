package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;
    static {
        try {
     String path = "Config.Properties";
     //dosyayi Java diline okur ve ya dondurur
            FileInputStream input = new FileInputStream(path);

            properties = new Properties();
       //  properties.load(input), Verileri dosyadan key/Value seklinde yukler
            properties.load(input);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String getpProperties(String keyName){
        return properties.getProperty(keyName);

    }

    public static String getProperties(String browser) {
        String getProperties = properties.getProperty(browser);
        return getProperties;
    }
}
