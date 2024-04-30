package exam01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex05 {
    public static void main(String[] args) {
//        HashSet<Book> books = new HashSet<>();
        Set<Book> books = new TreeSet<>(Comparator.reverseOrder());

        books.add(new Book("저자4", "책4", 1003));
        books.add(new Book("저자2", "책2", 1001));
        books.add(new Book("저자3", "책3", 1002));
        books.add(new Book("저자2", "책2", 1001));
        books.add(new Book("저자1", "책1", 1000));
        books.add(new Book("저자5", "책5", 1004));

        for (Book book: books) {
            System.out.println(book);
        }
    }
}
