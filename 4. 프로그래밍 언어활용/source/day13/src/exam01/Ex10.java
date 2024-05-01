package exam01;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4", "이름5");

        Collections.shuffle(names);
        System.out.println(names);

        String max = Collections.max(names);
        String min = Collections.min(names);
        System.out.println(max);
        System.out.println(min);
    }
}
