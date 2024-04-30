package exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("저자1", "책1", 1000 ));
        books.add(new Book("저자2", "책2", 1001 ));
        books.add(new Book("저자3", "책3", 1002 ));
        books.add(new Book("저자4", "책4", 1003 ));
        books.add(new Book("저자5", "책5", 1004 ));

        Iterator<Book> iter = books.iterator();

        while (iter.hasNext()) {
            Book book = iter.next();
            System.out.println(book);
        }
       iter = books.iterator();

        while (iter.hasNext()) {
            Book book = iter.next();
            System.out.println(book);
        }
    }
}
