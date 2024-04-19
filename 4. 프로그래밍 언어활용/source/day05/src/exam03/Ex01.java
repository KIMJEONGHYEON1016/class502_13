package exam03;

import exam02.B;

public class Ex01 {
    public static void main(String[] args) {
        Animal human = new Human(); // Animal
        human.move();

        Animal tiger = new Tiger();
        tiger.move();

        Animal bird = new Bird();
        bird.move();

        Animal[] animals = new Animal[3];
        animals[0] = human;
        animals[1] = tiger;
        animals[2] = bird;
    }
}
