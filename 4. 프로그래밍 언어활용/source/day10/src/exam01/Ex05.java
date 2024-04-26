package exam01;

public class Ex05 {
    public static void main(String[] args) {
        String trans1 = "BUS";
//        Transporatation BUS = Enum.valueOf(Transporatation.class, trans1);  //"BUS"라는 명칭을 가진 클래스 정보를 가져옴
//        System.out.println(BUS.name());

        Transporatation Bus = Transporatation.valueOf(trans1); // 문자열을 상수로
    }
}
