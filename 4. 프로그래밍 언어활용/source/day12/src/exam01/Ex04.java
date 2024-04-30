package exam01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {
//        HashSet<String> names = new HashSet<>();  // 순서 유지X

        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // 내림차순
            }
        };
        Set<String> names = new TreeSet<>(Comparator.naturalOrder());
        names.add("이름5");
        names.add("이름6");
        names.add("이름1");
        names.add("이름3");
        names.add("이름4");
        names.add("이름2");
        System.out.println(names);
    }
}
