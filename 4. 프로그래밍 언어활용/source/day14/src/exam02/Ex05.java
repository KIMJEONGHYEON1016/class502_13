package exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums = { 22, 11, 15, 35, 40 ,77};
        System.out.println();
        IntStream stm = Arrays.stream(nums);
        int total = stm.map(x -> x * x).sum();
        System.out.println(total);

        IntStream stm2 = Arrays.stream(nums);
        int total2 = stm2.map(x -> x * x * x).sum();
        System.out.println(total2);
    }
}
