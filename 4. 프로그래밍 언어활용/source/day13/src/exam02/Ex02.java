package exam02;

public class Ex02 {
    public static void main(String[] args) {
        int c = 10;  // 상수화
        Calculator cal = (a, b) -> a + b + c;

        int result = cal.add(10, 20);
        System.out.println(result);
    };
}
