package question;

public class Q5 {
    public static void main(String[] args) {
        for (int i = 1;  i <= 9; i += 1) {
            System.out.println(i + "단 ==================");
            for (int j = 1; j <= 9; j++) {
//                System.out.println( i * j );
                if (i > j) {
                    continue;
                }
                System.out.printf("%d X %d = %d\n" , i, j, i * j);
            }
            System.out.println();
        }
    }
}
