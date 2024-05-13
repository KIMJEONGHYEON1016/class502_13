package exam02;

public class DecorateCalculator implements Calculator{

    private Calculator calculator;  //누구를 바탕으로 객체화?


    public DecorateCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public long factorial(long num) {
        long stime = System.nanoTime();
        try {
            long result = calculator.factorial(num);

            return result;
        } finally {
            long etime = System.nanoTime();
            System.out.println(etime - stime);
        }
    }
}
