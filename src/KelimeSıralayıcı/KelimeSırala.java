package KelimeSıralayıcı;

import java.util.*;

public class KelimeSırala {
    public void start() {
        Scanner input = new Scanner(System.in);
        //Kullanıcıdan metin al.
        System.out.println("Metin giriniz: ");
        String metin = input.nextLine();

        //Metin içindeki kelimeleri ayırır.
        String[] kelimeler = metin.split("\\s+");

        Map<String, Integer> kelimeTekrarı = new HashMap<>();//Kelimeler ve tekar sayıları HashMap te tutulur.


        for (String kelime : kelimeler) {
            //Kelime daha önce HashMapte olup olmadığını kontrol et.
            if (kelimeTekrarı.containsKey(kelime)) {
                //Eğer kelime HasMapte varsa kelimenin değerini 1 arrtır.
                kelimeTekrarı.put(kelime, kelimeTekrarı.get(kelime) + 1);
            } else {//İlk kez kullanılıyorsa değerini 1 yap.
                kelimeTekrarı.put(kelime, 1);
            }
        }
        //Kelime tekrarları yazdırırlır.
        System.out.println("Metin içindeki kelime ve tekrar sayıları.");
        for (Map.Entry<String, Integer> entry : kelimeTekrarı.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue() + " kez.");
        }


    }
}
