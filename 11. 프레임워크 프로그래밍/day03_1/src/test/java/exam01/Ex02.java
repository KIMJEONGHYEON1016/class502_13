package exam01;

import config.AppCtx;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Calculator calculator = ctx.getBean(Calculator.class);
        long result = calculator.factorial(10L);
        System.out.println(result);

        long result2 = calculator.factorial(10L);
        System.out.println(result2);

        long result3 = calculator.factorial(10L);
        System.out.println(result3);

        long result4 = calculator.factorial(10L);
        System.out.println(result4);

        ctx.close();
    }
}
