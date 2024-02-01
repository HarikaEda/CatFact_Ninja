package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import static modules.BaseClass.logger;

public class ConfigReaders {

    private static Properties properties;
    static {
        try{
            String path ="configuration.properties";
            FileInputStream input= new FileInputStream(path);
            properties=new Properties();
            properties.load(input);

        }catch(Exception e){
            logger.error("Configuration file can not be found");
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyName) {
        return properties.getProperty(keyName);
    }
}
