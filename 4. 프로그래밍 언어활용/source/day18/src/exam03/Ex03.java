package exam03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Ex03 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm");
        String strDate = sdf.format(date);
        System.out.println(strDate);
    }
}
