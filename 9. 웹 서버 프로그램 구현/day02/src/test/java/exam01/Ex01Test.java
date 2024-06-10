package exam01;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class Ex01Test {

    @Test
    void test1() {
        // Locale.KOREAN
        Faker faker = new Faker(new Locale("ko_kr"));
        String name = faker.name().fullName();

        System.out.printf(name);
    }

    @Test
    void test2() {
        Faker faker = new Faker(Locale.KOREAN);
        String address = faker.address().zipCode() + " " + faker.address().cityName() + " " + faker.address().streetAddress() + " " + faker.address().secondaryAddress();

        System.out.printf(address);
    }
}
