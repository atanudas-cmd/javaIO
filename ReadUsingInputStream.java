/*
 * 1.Write a program to read text from .txt file using InputStream
 */


import java.io.FileInputStream;
import java.io.InputStream;


public class ReadUsingInputStream {

    public static void main(String[] args) {

        try {
            
            InputStream fis = new FileInputStream("D:/Tution_java.txt");
            int i;
           
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            fis.close();
        } 
        catch (Exception e) {
          
            e.getStackTrace();
        }
    }
}

