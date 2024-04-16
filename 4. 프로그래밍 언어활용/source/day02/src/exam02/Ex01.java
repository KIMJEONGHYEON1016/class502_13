package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
//        s1.year = 2024;
//        s1.month = 2;
//        s1.day = 31;

        s1.setYear(2024);
        s1.setMonth(2);
        s1.setDay(9999999);
        s1.showDate();

        int month = s1.getMonth();
    }
}
