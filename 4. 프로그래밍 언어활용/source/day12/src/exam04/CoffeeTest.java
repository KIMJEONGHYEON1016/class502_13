package exam04;

public class CoffeeTest {

    public static void main(String[] args) {

        Person kim = new Person("Kim", 9000);
        StarCoffee starCoffee = new StarCoffee();
        BeanCoffee beanCoffee = new BeanCoffee();

        kim.buyStarCoffee(starCoffee, 4300);
        kim.buyBeanCoffee(beanCoffee, 4500);

    }
}