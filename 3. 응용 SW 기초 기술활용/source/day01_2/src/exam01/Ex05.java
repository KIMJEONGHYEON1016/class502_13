package exam01;

public class Ex05 {
    public static void main(String[] args) {
        int num1 = 10;
        final int num2 = 20;

        final int num3;
        num3 = 30;
        num1 = num3 ;
        System.out.println(num1);
        num1 = 40;
        System.out.println(num1);
    }
}
