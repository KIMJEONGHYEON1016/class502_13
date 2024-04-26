package exam01;

public class Ex04 {
    public static void main(String[] args) {
        Transporatation trans = Transporatation.TAXI;
        String str = trans.name();  //trans.toString() 스트링으로 변환
        System.out.println(str);  //상수를 문자열로

        int ordinal = trans.ordinal();  //상수의 위치 번호
        System.out.println(ordinal);
    }
}
