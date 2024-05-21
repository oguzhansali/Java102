package KitapSıralayıcı;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Nesneler oluşturuldu.
        Book b1 = new Book("Matematik",200,"Hezarfen","2020");
        Book b2 = new Book("Fizik",180,"Edison","2019");
        Book b3 = new Book("Kimya",220,"Yazar A","2017");
        Book b4 = new Book("Biyoloji",100,"Ahmet Necdet","1987");
        Book b5 = new Book("Hayat Bilgisi",500,"Recep","2005");

        Set<Book> bookName= new TreeSet<>();//
        bookName.add(b1);
        bookName.add(b2);
        bookName.add(b3);
        bookName.add(b4);
        bookName.add(b5);
        //Kitapları alfabetik sıralar.
        for (Book book: bookName){
            System.out.println(book);
        }
        System.out.println("===========");
        //Kitaplar sayfa sayısına göre sıralanır.
        Set<Book> booksPage = new TreeSet<>(new OrderComparator().reversed());
        booksPage.add(b1);
        booksPage.add(b2);
        booksPage.add(b3);
        booksPage.add(b4);
        booksPage.add(b5);

        for (Book pageSort: booksPage){
            System.out.println(pageSort);
        }



    }
}
