package exam01;

import org.junit.jupiter.api.Test;

public class Ex01 {

    @Test
    void test1() {

        long stime = System.nanoTime();
        ImplCalculator cal1 = new ImplCalculator();
        long result1 = cal1.factorial(10L);
        System.out.printf("cal1=%d%n", result1);
        long etime = System.nanoTime();
        System.out.printf("cal1=%d%n", (etime - stime));

        long stime2 = System.nanoTime();
        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(10L);
        System.out.printf("cal2=%d%n", result2);
        long etime2 = System.nanoTime();
        System.out.printf("cal2=%d%n", (etime2 - stime2));
    }

    @Test
    void test2() {
        Calculator cal1 = new ProxyCalculator(new ImplCalculator());

        long result1 = cal1.factorial(10L);
        System.out.printf("cal1=%d%n", result1);

        Calculator cal2 = new ProxyCalculator(new RecCalculator());
        long result2 = cal2.factorial(10L);
        System.out.printf("cal2=%d%n", (result2));
    }
}
