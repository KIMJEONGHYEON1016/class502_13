package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex08 {
    public static void main(String[] args) {
        String str = "AAA\n1234\nBBBB\n456\nCCCCC\nDDDDDDDDDDDDDDD";
        // 4글자로 구성된 단어
//        Pattern p1 = Pattern.compile("\\b....\\b");
        Pattern p1 = Pattern.compile("\\b.{1,4}\\b");

        Matcher m1 = p1.matcher(str);
        while (m1.find()) {
            System.out.println(m1.group());
        }
    }
}
