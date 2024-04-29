package exam02;

import java.util.ArrayList;

public class Jucier {
    // ? - Fruit, Apple, Grape 아래로
    public static void make(FruitBox<? extends Fruits> box) {
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);
    }

    //지네릭 메서드, extends만 사용 가능
    public static <T extends Fruits> void make3(FruitBox<T> Box) {

    }

    // ? - Apple, Fruit, Object  위로
    public static void make2(FruitBox<? super Apple> box) {
        ArrayList<?> fruits = box.getItems();
        System.out.println(fruits);
    }
}
