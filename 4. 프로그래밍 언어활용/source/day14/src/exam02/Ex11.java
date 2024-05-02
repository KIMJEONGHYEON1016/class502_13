package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex11 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(60, 78, 80, 90, 100, 87);
        long sum = scores.stream().mapToInt(x -> x).sum();
        System.out.println(sum);
    }
}
