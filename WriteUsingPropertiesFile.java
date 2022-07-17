/*
 * 10.Write a program to write data to properties file
 */


import java.io.FileOutputStream;
import java.util.Properties;

public class WriteUsingPropertiesFile {
    public static void main(String args[]) {

        try {
           
            Properties props = new Properties();
           
            props.put("Name", "Sharan");
            props.put("E.no", "317");
            props.put("College", "ICFAI Tech");

           
            FileOutputStream outputStrem = new FileOutputStream("D:/Tution_java.txt");
          
            props.store(outputStrem, "This is a sample properties file");
            System.out.println("Properties file created");

        } catch (Exception e) {
           
            e.printStackTrace();
        }
    }
}