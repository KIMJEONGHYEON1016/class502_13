package exam01;

import java.io.File;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) throws IOException, InterruptedException {
        File tmpFile = File.createTempFile("tmp", ".log", new File ("D:/fstudy"));

        tmpFile.deleteOnExit();

        Thread.sleep(5000);
        System.out.println("종료!");
    }
}