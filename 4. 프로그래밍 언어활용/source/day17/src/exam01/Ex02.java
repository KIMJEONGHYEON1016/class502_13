package exam01;

import java.util.Calendar;


public class Ex02 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH,30);
        Ex01.printDate(cal);
    }
}
