package exam13;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();                             //우선 Outer 클래스를 객체로 생성
        Calculator cal = out.method(30);                  //method를 실행하면  객체의 주소가 반환되는데 그걸 cal에 할당. 참조를 계속함으로써 제거되지 않고 유지.
        int result = cal.add(10, 20); // 30 + 10 + 20             result라는 변수에 cal 객체의 add메서드 대입 값을 할당
        System.out.println(result);
    }
}