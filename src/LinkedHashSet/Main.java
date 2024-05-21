package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {//Sırlama işlemi girildiği giibdi.HashSet de hafızaya göre sıralanır çıktı girdi ile aynı olmayabilir.
        LinkedHashSet<Integer> lset=new LinkedHashSet<>();
        lset.add(20);
        lset.add(10);
        lset.add(10);
        lset.add(20);
        lset.add(30);

        Iterator<Integer> itr= lset.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
