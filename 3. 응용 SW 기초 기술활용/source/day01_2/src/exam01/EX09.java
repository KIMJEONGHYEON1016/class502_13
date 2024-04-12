package exam01;

public class EX09 {
    public static void main(String[] args) {
        long num1 = 100000000000000000L;
        double num2 = num1;
        double num4 = 0;

        for (int i = 0; i < 1000; i ++) {
            num4 += 0.1;
        }
        System.out.println(num4);
    }
}
