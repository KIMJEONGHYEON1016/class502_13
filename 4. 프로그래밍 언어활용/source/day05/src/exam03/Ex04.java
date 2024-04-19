package exam03;

public class Ex04 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.move();

        Tiger tiger2 = new Tiger();
        tiger2.move(); //  tiger.move() ==  tiger2.move() 참조가 같음

    }
}
