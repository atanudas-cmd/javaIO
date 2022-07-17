/*
 * 9.Write a program to read data from properties file
 */


import java.io.FileInputStream;
import java.util.Properties;

public class ReadUsingPropertiesFile {

    public static void main(String args[]) {
        Properties prop = readPropertiesFile("D:/Tution_java.txt");
        System.out.println("Name: " + prop.getProperty("Name is:"));
        System.out.println("E.no: " + prop.getProperty("E.no"));
        System.out.println("College: " + prop.getProperty("College"));
    }

    public static Properties readPropertiesFile(String fileName) {
        Properties prop = null;
        try {

         
            FileInputStream fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
            fis.close();

        } catch (Exception e) {
          
            e.printStackTrace();
        }
        return prop;
    }
}


