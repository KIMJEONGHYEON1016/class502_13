package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Human human = new Human();
        human.move();

        Human human2 = new Human();
        human2.move(); //  human.move() ==  human2.move() 참조가 같음

    }
}
