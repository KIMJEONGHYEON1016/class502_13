package exam03;

import java.lang.annotation.ElementType;
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({TYPE, METHOD, FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    int min() default 10; // 설정 항목, 기본 값 10
    int max() default 100; // 기본값 100
    String[] names() default {"이름1"};
    String value();  //설정이 하나일때만 가능
}
