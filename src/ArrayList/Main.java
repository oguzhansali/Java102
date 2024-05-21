package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();

        liste.add("Trabzon");
        liste.add("İstanbul");
        liste.add("Kayseri");
        liste.add("İzmir");
        liste.add("Sivas");
        liste.clear();//Listeyi temizler.

        System.out.println(liste);


        /*
        List<String> liste2= new ArrayList<>();
        liste2.add("Adıyaman");
        liste2.addAll(liste);
        System.out.println(liste2);*/
        /*
        liste.add(10);
        liste.add(20);
        liste.add(null);
        liste.add(1);
        */
        //liste.add(2,15);//15 sayısını indis 2 ye ekler ve diğer elemanları kaydırır.
        //liste.set(2,15);//indis 2 deki elamanı 15 ile değiştiri.

        //System.out.println(liste.contains(123));
        //System.out.println(liste.remove(1));

        /*
        Iterator<Integer> itr=liste.iterator();
        while (itr.hasNext()){//Eğer sıra bir sayı varsa  içindeki her bir elemanı verir.
            System.out.println(itr.next());
        }*/

        //System.out.println(liste.get(3));//Listee içindeki 3. indisi getiriri.

        //System.out.println(liste.indexOf(12));//Liste içindeki 1 sayısının olduğu indis numarasını verir. Eğer listee içinde olmayan bir eleman varsa -1 çıktısı verir ve öyle bir elemanın olmadığı anlaşılır.
        /*
        for (String element: liste){
            System.out.println(element);
        }*/


    }

}
