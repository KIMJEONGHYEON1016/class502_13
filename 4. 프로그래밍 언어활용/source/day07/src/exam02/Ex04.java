package exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt" );

            System.out.println("파일 작업...");

        }   catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {  //자원 해제
                try {
                    fis.close();
                } catch (IOException e) {

                }
            }
        }
    }
}
