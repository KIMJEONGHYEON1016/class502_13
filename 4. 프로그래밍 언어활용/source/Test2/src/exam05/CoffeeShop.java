package exam05;

public class CoffeeShop {

    public void enter(Person person) {
        System.out.printf("%s님이 입장하였습니다.%n", person.getName());

    }

    public void order(Person person) {
        int money = person.getMoney();
        if (money == 4500) {
            System.out.println("시킨 음료 COFFEEBEANLATTE가 나왔습니다.");
        } else if (money == 4000) {
            System.out.println("시킨 음료 STARBUCKSAMERICANO가 나왔습니다.");
        }
    }
}
