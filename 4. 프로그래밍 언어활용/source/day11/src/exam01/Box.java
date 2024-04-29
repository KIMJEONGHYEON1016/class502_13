package exam01;
// T는 Fruit의 하위클래스로 한정
public class Box<T extends Fruit & Eatable> {   //Box : 원시타입
    private T item;

//    private static T; - 사용불가, 처음부터 공간을 할당 받기때문에 자료형이 명확해야함.
//    private static T[] nums = new T[3]; - 사용불가, 배열에서 공간 생성을 위해서는 자료형이 명확 해야함.


    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        // T == Object   ->   T == Fruit로 변경됨
        return item.get();
    }
}
