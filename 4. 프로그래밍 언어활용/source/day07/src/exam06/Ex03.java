package exam06;

public class Ex03 {
    public static void main(String[] args) {
        Book b1 = new Book(1000, "책1", "저자1");
        Book b2 = new Book(1001, "책2", "저자2");
        System.out.printf("b1 == b2: %s%n", b1 == b2);
        System.out.println(b1.equals(b2));
    }
}
