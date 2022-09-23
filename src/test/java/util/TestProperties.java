package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class TestProperties {

    public static String getVal(String key)
    {
        String keyval = null;
        //Let's consider properties file is in project folder itself
        String banner = System.getProperty("banner","safeway");
        File file = new File("src/test/resources/"+banner+".properties");

        //Creating properties object
        Properties prop = new Properties();
        //Creating InputStream object to read data
        FileInputStream objInput = null;
        try{
            objInput = new FileInputStream(file);
            //Reading properties key/values in file
            prop.load(objInput);
            keyval = prop.getProperty(key);
            objInput.close();
        }catch(Exception e){System.out.println(e.getMessage());}
        return keyval;
    }

    public static void setVal(String key, String keyval)
    {
        String banner = System.getProperty("banner");
        File file = new File("./"+banner+".properties");
        Properties prop = new Properties();
        FileInputStream objInput = null;
        try {
            objInput = new FileInputStream(file);
            prop.load(objInput);
            objInput.close();

            FileOutputStream out = new FileOutputStream("./config.properties");
            prop.setProperty(key, keyval);
            prop.store(out, null);
            out.close();
        } catch (Exception e) {System.out.println(e.getMessage());}
    }

    public static void main(String[] args) {
        System.out.println("Homepage url: " + getVal("Homepage"));

        //setVal("username", "JohnConer");

    }
}


