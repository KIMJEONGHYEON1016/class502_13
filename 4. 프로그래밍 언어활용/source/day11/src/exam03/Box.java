package exam03;

public class Box<T> {

    private T item;

    //반환값 앞에 지네릭이 없기때문에 그냥 지네릭 자료형 (객체가 될때 T가 결정)
    public void method1(T str1, T str2) {

    }

    //위 메서드와 아래 메서드는 T가 다름

    //지네릭 메서드 - 호출 시에 T의 자료형이 결정됨.
    public <T> void method2(T str1, T str2) {

    }

}
