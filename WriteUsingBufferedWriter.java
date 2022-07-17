/*
 * 8.Write text to a .txt file using BufferedWriter
 */


import java.io.BufferedWriter;
import java.io.FileWriter;


public class WriteUsingBufferedWriter {
    public static void main(String[] args) {

        String s = "This text is written using BufferedWriter.";

        try {
            
            FileWriter fw = new FileWriter("D:/Tution_java.txt");
      
            BufferedWriter bw = new BufferedWriter(fw);

          
            bw.write(s);
  
            bw.close();
            fw.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
          
            e.printStackTrace();
        }
    }
}