package exam03;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

public class Ex02 {
    public static void main(String[] args) throws ParseException {
        String price = "1,000,000원";

        DecimalFormat df = new DecimalFormat("#,###원");
        Number number = df.parse(price);
        long num = number.longValue();
        System.out.println(num);
        ArrayList<String> str = new ArrayList<>();

        str.add("a");
        str.add("b");
        str.add("c");
        str.add("\n");
        str.add("d");
        String a ;
        a = String.join("  ", str);
        System.out.println(a);
    }
}
