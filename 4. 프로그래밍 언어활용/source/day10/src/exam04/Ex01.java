package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();   //Box 객체만듬
        appleBox.setItem(new Apple());        //Box 객체의 메서드 setItem을 Apple 클래스로 만든 객체를 매개변수로 활용

        Apple apple = (Apple)appleBox.getItem();  //1) 형변환의 번거로움
        System.out.println(apple.get());

        Box grapeBox = new Box();
        grapeBox.setItem(new Grape());

        if (grapeBox.getItem() instanceof Grape) {  //2) 타입안정성이 떨어지는 문제
            Grape grape = (Grape) grapeBox.getItem();
            System.out.println(grape.get());
        }
    }
}
