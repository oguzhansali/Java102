package KitapSıralayıcı;

import java.util.Comparator;

public class OrderComparator implements Comparator<Book> {

    public int compare(Book b1, Book b2){
        return Integer.compare(b1.getPage(),b2.getPage());
    }
}
