package exam04;

public interface Seller {
    void sell();

    default void order() {
        System.out.println("셀러에서 주문");
    }
}
