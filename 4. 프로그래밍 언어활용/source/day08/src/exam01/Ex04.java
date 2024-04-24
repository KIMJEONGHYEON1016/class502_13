package exam01;

public class Ex04 {
    Double dou1 = 3.0;

    public static void main(String[] args) {
        String str1 = new String("ABC");
        String str2 = new String("ABC");
        Double dou1 = 3.0;
        Double dou2 = 3.0; // Double.valueOf(3.0);
        Integer int1 = 3000000;
        Integer int2 = 3000000;

        Character char1 = '#';
        Character char2 = '#';
        System.out.printf("int1 주소: %d%n", System.identityHashCode(int1));
        System.out.printf("int2 주소: %d%n", System.identityHashCode(int2));
        System.out.printf("char1 주소: %d%n", System.identityHashCode(char1));
        System.out.printf("char2 주소: %d%n", System.identityHashCode(char2));
        System.out.printf("dou1 주소: %d%n", System.identityHashCode(dou1));
        System.out.printf("dou2 주소: %d%n", System.identityHashCode(dou2));
        System.out.println(char1 == char2);
        System.out.println(char1.equals(char2));
        System.out.println(dou1 == dou2);
        System.out.println(dou1.equals(dou2));
        System.out.printf("str1 == str2: %s%n", str1 == str2 );
        System.out.printf("str1.equals(str2): %s%n", str1.equals(str2));
        System.out.printf("str1 주소: %d%n", System.identityHashCode(str1));
        System.out.printf("str1 주소: %d%n", System.identityHashCode(str2));
    }


}

