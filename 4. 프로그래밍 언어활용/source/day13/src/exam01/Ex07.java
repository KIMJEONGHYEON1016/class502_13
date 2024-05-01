package exam01;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int[] nums = { 22, 10, 5, 1, 99, 50 };
        Arrays.sort(nums); // 기본 정렬, java.lang.Comparable
        System.out.println(Arrays.toString(nums));
    }
}
