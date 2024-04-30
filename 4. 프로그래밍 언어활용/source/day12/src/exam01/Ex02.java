package exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("저자1", "책1", 1000 ));
        books.add(new Book("저자2", "책2", 1001 ));
        books.add(new Book("저자3", "책3", 1002 ));
        books.add(new Book("저자4", "책4", 1003 ));
        books.add(new Book("저자5", "책5", 1004 ));

        ListIterator<Book> iter = books.listIterator();

        System.out.println("---순방향---");
        while (iter.hasNext()) {
            Book book = iter.next();
            int index = iter.nextIndex();
            System.out.println(book);
            System.out.println(index);
        }

        System.out.println("---역방향---");
        while (iter.hasPrevious()) {
            Book book = iter.previous();
            int index = iter.previousIndex();
            System.out.println(book);
            System.out.println(index);
        }



    }
}
