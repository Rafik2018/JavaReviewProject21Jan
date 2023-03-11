package review10;

import java.util.*;

public class CollectionViewOfMaps {


    public static void main(String[] args) {

        Map<String, Double> lmap = new LinkedHashMap<>();
        lmap.put("Milk", 5.99);
        lmap.put("Eggs", 6.58);
        lmap.put("Bread", 2.99);
        lmap.put("Cucumber", 2.50);
        lmap.put("Eggs", 7.99);
        lmap.put("Tomato", 2.50);


        Set<String> keys = lmap.keySet();
        for (String key : keys) {
            System.out.println(key + "="+lmap.get(key));


        }

        System.out.println("--------------------------------");


        Iterator<String> iterator = keys.iterator();
   while (iterator.hasNext()){
       String k =iterator.next();
       System.out.println(k+" = "+lmap.get(k));



   }

        System.out.println("-----------------------------------------");

   Collection<Double> values =lmap.values();


   for (double val :values){
       System.out.println(val+" ");
   }
    }


}
