package exam02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자만 입력");
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("\\D");  // \\d: 숫자
        Matcher m1  = p1.matcher(str);
        if (m1.find()) {
            System.out.println("숫자만 입력해.");
        }
    }
}
