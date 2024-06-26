package exam03;

import java.util.HashMap;
import java.util.Map;

public class CoffeeBean extends AbstractCoffeeShop{

    int a = 10 ;

    @Override
    public String toString() {
        return "CoffeeBean{" +
                "a=" + a +
                '}';
    }

    private static Map<String, Integer> menus;

    static {
        menus = new HashMap<>();
        menus.put("아메리카노", 3800);
        menus.put("라떼", 4300);
    }

    public CoffeeBean() {
        super("커피빈", menus);
    }
}
