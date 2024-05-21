package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashMap {
    public static void main(String[] args) {
        //FİFO--> first in first out.
        //LİLO--> last in last out.
        HashSet<Integer> hset = new HashSet<>();
        hset.add(10);//Tekrar eden sayılar Hashmapte aynı hafızaya denk geldiği için tekrar etmiyor.Arraydan farkı bu.
        hset.add(20);
        hset.add(30);
        hset.add(40);
        hset.add(20);
        hset.add(null);

        //System.out.println(hset.isEmpty());//İçerisinin boşmu dolumu  sorgulaması yapılıyor.
        //System.out.println(hset.contains(20));//İçerisinde 20 sayıyısı varmı diye sorgulama yapar.
        hset.remove(10);//Hashap içerisinde 10 değeri varmı varsa çıkar işlemi yapar.
        //hset.clear();//hset içerisini temizler.
        /*for (Integer sayi :hset){
            System.out.println(sayi);
        }*/

        Iterator<Integer> itr = hset.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
