package exam02;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        String[] strs = {"가나", "다라", "마바"};
        String[] strs2 = new String[strs.length];

//        for (int i = 0; i < strs.length; i++) {
//            System.out.println(strs[i]);
//        }

        for (String str : strs) {
            System.out.println(str);
        }

        for (int i = strs.length - 1, j = 0; i >= 0 && j < strs.length; i--, j++) {
                    strs2[j] = strs[i];
            }
            System.out.println(Arrays.toString(strs2));

        }
}
