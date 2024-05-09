package exam01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Ex03 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime endTime = LocalTime.of(17,50);

        Duration du = Duration.between(now, endTime);
        long seconds = du.getSeconds();
        LocalTime time = LocalTime.of(0,0,0);
        LocalTime time2 = time.plusSeconds(seconds);

        System.out.println(time2);
    }
}
