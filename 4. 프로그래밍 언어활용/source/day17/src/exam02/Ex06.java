package exam02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Ex06 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date2 = today.plus(150, ChronoUnit.DAYS);
        System.out.println(today);
        System.out.println(date2);
    }
}
