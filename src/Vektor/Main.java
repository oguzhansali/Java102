package Vektor;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<String> liste=new Vector<>();
        liste.add("Trabzon");
        liste.add("İstanbul");
        liste.add("İzmir");
        liste.add("Rize");

        liste.add(2,"Bursa");
        Iterator<String> ıtr=liste.iterator();
        while (ıtr.hasNext()){
            System.out.println(ıtr.next());
        }

    }
}
