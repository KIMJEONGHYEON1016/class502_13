package exam05;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>(); //객채 생성시 투입된 자료형으로 Object -> 형변환
        appleBox.setItem(new Apple());

        Apple apple = appleBox.getItem();
        System.out.println(apple.get());
    }
}
