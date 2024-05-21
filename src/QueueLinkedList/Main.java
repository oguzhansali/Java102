package QueueLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> liste = new LinkedList<>();
        liste.add("Oğuzhan");
        liste.add("SALİ");
        liste.offer("Patika");
        liste.remove("SALİ");

        Iterator<String> itr = liste.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
