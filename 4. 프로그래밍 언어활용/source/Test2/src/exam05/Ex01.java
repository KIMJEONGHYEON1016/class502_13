package exam05;

public class Ex01 {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        Person kim = new Person("김씨", 4000);
        Person lee = new Person("이씨", 4500);

        coffeeShop.enter(kim);
        coffeeShop.order(kim);

        coffeeShop.enter(lee);
        coffeeShop.order(lee);
    }
}
