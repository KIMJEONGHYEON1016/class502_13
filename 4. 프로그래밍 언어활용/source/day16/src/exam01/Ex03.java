package exam01;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] scores = { 67, 80, 100, 98, 76, 56 };

        int total = Arrays.stream(scores).reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(total);
    }
}
