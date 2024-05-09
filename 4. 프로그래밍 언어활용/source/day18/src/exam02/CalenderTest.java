package exam02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CalenderTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("년 월 입력:");
            String input = sc.nextLine(); // 2024 5

            if (input.equals("exit")) {
                System.out.println("종료 합니다.");
                break;
            }

            try {
                String[] data = input.split("\\s+");
                int year = Integer.parseInt(data[0]);
                int month = Integer.parseInt(data[1]);


                System.out.printf("---- %d년 %d월 -----%n", year, month);
                System.out.println("일  월  화  수  목  금  토");
                System.out.println(getCalender(year, month));

            } catch (Exception e) { // 숫자 형식 오류가 발생한 경우
                System.out.println("입력 형식이 잘못되었습니다. 입력 예) 2024 5");
                continue;
            }
        }


    }
    public static String getCalender(int year, int month) {
        /**
         * 1. 매월의 1일이 어떤 요일에 시작하는지
         * 2. 매월의 종료일이 무엇인지(28,29,30,31)
         */
        ArrayList<String> days = new ArrayList<>();
        LocalDate startDate = LocalDate.of(year, month, 1);
        int startYoil = startDate.getDayOfWeek().getValue(); //1~7
        LocalDate endDate = startDate.plusMonths(1).minusDays(1);


        //처음 공백
        for (int i = 1; i <= startYoil % 7; i++){
                days.add("   ");
        }

        //첫째 줄 (10 이하의 일수)
        for (int j = 1; j != 10; j++) {
            days.add(j + "   ");
            for (int k = 1; k < 6; k++) {
                if (days.indexOf(j + "   ") == 6 * k) {
                    days.set(6 * k, j + "\n");
                }
            }
        }

        // 나머지 일수
        for (int j1 = 10; j1 != endDate.getDayOfMonth()+1; j1++) {
            days.add(j1 + "  ");
            for (int k = 1; k < 6; k++) {
                if (days.indexOf(j1 + "  ")  == 6 * k) {
                    days.set(6 * k, j1 + "\n");
                }
            }
        }
        //문자열로 변환함
        String calender = String.join("", days);

        return calender;
    }
}
