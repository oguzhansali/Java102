package MapInterfaceHashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> country= new HashMap<>();
        country.put("TR","Türkiye");
        country.put("GR","Almanya");
        country.put("EN","İngiltere");
        //System.out.println(country.get("TR"));
        //country.remove("EN");
        //country.clear();
        //System.out.println(country.size());
        //System.out.println(country.get("EN"));

        for (String countryKey: country.keySet()){//Value uzerinden keylere ulaşılır.
            System.out.println(countryKey);
        }

        System.out.println("----------");

        for (String countraValue: country.values()){//Keylere göre valueler alınır.
            System.out.println(countraValue);
        }
    }
}
