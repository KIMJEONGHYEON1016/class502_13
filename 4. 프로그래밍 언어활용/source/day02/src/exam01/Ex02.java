package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int r = add(10, 20);
//        System.out.println(r);
    }

    static int add(int n1, int n2) { // 지역변수
        int result = n1 + n2;

        return result;
    }
}
