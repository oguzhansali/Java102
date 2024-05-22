package KitapSıralayıcı;

import java.util.Comparator;

//Book nesnesini sayfa sayısına göre sıralayan sınıf.
public class OrderComparator implements Comparator<Book> {
    //b1 ve b2 nin sayfa sayısını karşılaştırır.
    public int compare(Book b1, Book b2){
        return Integer.compare(b1.getPage(),b2.getPage());
    }
}
