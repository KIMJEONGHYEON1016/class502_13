package exam03;

import exam02.B;

public class Ex05 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.move();

        Bird bird2 = new Bird();
        bird2.move(); //  bird.move() ==  bird2.move() 참조가 같음

    }
}
