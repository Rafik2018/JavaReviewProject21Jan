package review_11;

import java.util.HashMap;
import java.util.Map;

public class EntrySetDemo {

//    print only those elements which contain the letter a or e in their name price is more than 8 dollars

       public static void main(String[] args) {


        Map<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 12.5);
        fruitMap.put("Banana", 4.9);
        fruitMap.put("Dragon Fruit", 5.6);
        fruitMap.put("pear", 16.5);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 18.5);


        var entrySet = fruitMap.entrySet();
        for (var entry : entrySet) {

         String key = entry.getKey();
         if ((key.contains("a") || key.contains("e"))&& entry.getValue()>8){
             System.out.println(key+" "+entry.getValue());
         }

            System.out.println((2+2)*2);

       /* for (Map.Entry<String, Double> entry : fruitMap.entrySet()) {
            String fruitName = entry.getKey();
            double price = entry.getValue();
            if ((fruitName.contains("a") || fruitName.contains("e")) && price > 8.0) {
                System.out.println(fruitName + ": $" + price);*/


        }
    }

}
