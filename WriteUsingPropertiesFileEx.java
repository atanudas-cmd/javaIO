/*
* 10.Write a program to write data to properties file
*/


import java.io.FileOutputStream;
import java.util.Properties;

public class WriteUsingPropertiesFileEx {
   public static void main(String args[]) {

       try {
          
           Properties props = new Properties();
          
           props.put("Name", "Atanu");
           props.put("E.no", "18");
           props.put("College", "Adamas University");

        
           FileOutputStream outputStrem = new FileOutputStream("D:/Tution_java.txt");
         
           props.store(outputStrem, "This is a sample properties file");
           System.out.println("Properties file created");

       } catch (Exception e) {
          
           e.printStackTrace();
       }
   }
}
