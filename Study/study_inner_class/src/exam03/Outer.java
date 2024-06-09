package exam03;

public class Outer {
    private int outNum = 10;

    public void method() {
        int localNum = 20; // 지역 변수

        class LocalInner {
            public void display() {
                System.out.println(outNum);
                System.out.println(localNum);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }
}