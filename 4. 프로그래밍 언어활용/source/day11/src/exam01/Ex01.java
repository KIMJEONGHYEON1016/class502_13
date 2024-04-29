package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();   //Box 에 T가 Apple로 교체됨
        appleBox.setItem(new Apple());
//        appleBox.setItem(new Grape()); 타입 안정성 확보

        Apple apple = appleBox.getItem();  //형 변환이 필요없음
        System.out.println(appleBox);
    }
}
