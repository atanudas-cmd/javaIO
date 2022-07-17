/*
 * 4.Write text to a .txt file using BufferedOutputStream
 */


import java.io.*;

public class WriteUsingBufferedOutputStream {

    public static void main(String[] args) {
        String s = "This text is written using BufferedOutputStream.";

        try {
          
            FileOutputStream fos = new FileOutputStream("D:/Tution_java.txt");
        
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] arr = s.getBytes();
          
            bos.write(arr);
          
            bos.close();
            fos.close();
            System.out.println("Data is written to the file.");

        } catch (Exception e) {
          
            e.printStackTrace();
        }
    }
}
