package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {//LinkedList ile ArrayList arasındaki fark ArrayList te listeye bir veri ellenirken  verinin girildiği indisten ittbaren bir kaydırma işlemi yapar ve listenin uzunluğuna bağlı olarak işlem uzar.Ama LinkedListte seçilen indise bir sayı girildiğinde kayddırma işlemi yapılmaz ve o araya değer eklenir.
    public static void main(String[] args) {
        List<String> liste=new LinkedList<>();
        liste.add("Oğuzhan");
        liste.add("Sali");
        liste.add("Java");
        liste.add("102");

        Iterator<String> itr =liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
