package exam02;

public class Ex01 {
    public static void main(String[] args) {
        long stime = System.nanoTime();

        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10L);
        System.out.println(result1);

        long etime = System.nanoTime();
        System.out.println(etime - stime);

        stime = System.nanoTime();

        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10L);
        System.out.println(result2);
        etime = System.nanoTime();
        System.out.println(etime - stime);

    }
}
