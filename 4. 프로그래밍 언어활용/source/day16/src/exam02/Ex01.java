package exam02;

import java.util.Date;

public class Ex01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        int year = date.getYear();
        int month = date.getMonth();
        System.out.printf("year=%d, month=%d%n", year, month + 1);
    }
}
