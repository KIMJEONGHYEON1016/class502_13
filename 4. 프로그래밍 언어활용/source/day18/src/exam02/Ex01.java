package exam02;

import java.time.LocalDate;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(today);
        LocalDate startDate = LocalDate.of(today.getYear(), today.getMonth(), 1);

        int startYoil = startDate.getDayOfWeek().getValue(); //1~7
        System.out.println(startYoil % 7);

        LocalDate endDate = startDate.plusMonths(1).minusDays(1);
        int endYoil = endDate.getDayOfWeek().getValue(); //1~7
        System.out.println(endYoil % 7);
    }
}
