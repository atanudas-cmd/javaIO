/* 5.Write a program to read text from .txt file using FileReader
 */


import java.io.FileReader;


public class ReadUsingFileReader {
    public static void main(String[] args) {

        try {
            
            FileReader fr = new FileReader("D:/Tution_java.txt");

            int i;
           
            while ((i = fr.read()) != -1) {
               
                System.out.print((char) i);
            }
            
            fr.close();

        } catch (Exception e) {
           
            e.printStackTrace();
        }
    }
}