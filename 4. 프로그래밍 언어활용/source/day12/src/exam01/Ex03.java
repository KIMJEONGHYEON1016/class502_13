package exam01;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("저자1", "책1", 1000 ));
        books.add(new Book("저자2", "책2", 1001 ));
        books.add(new Book("저자3", "책3", 1002 ));
        books.add(new Book("저자4", "책4", 1003 ));
        books.add(new Book("저자5", "책5", 1004 ));

        for (Book book: books) {
            System.out.println(book);
        }

        books.forEach((System.out::println));
    }
}
