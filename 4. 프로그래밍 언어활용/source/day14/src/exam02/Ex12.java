package exam02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Ex12 {
    public static void main(String[] args) {
        int[] nums = {33,10,5,1,3,2,5,5,325,34,5643,6,3,543,6,436,3};
        int[] nums2 = Arrays.stream(nums).sorted().toArray();
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = Arrays.stream(nums).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(x -> x)
                .toArray();
        System.out.println(Arrays.toString(nums3));
    }
}
