package review_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EntrySetDemo1 {


//    remove those elements which contain the letter a or e in their name and their price is more than 8 dollars

    public static void main(String[] args) {

        Map<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 12.5);
        fruitMap.put("Banana", 4.9);
        fruitMap.put("Dragon Fruit", 5.6);
        fruitMap.put("pear", 16.5);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 18.5);

        //fruitMap.forEach((key,value)-> System.out.println(key+"  "+value));
        // Remove those elements which contain the letter a or e in their name and their price is more than 8 dollars

        //       We are using remove if method to remove the elements -> its actually part of the syntax of lambda expression
        fruitMap.entrySet().removeIf(entry -> (entry.getKey().contains("a") || entry.getKey().contains("e"))&& entry.getValue()>8);
        System.out.println(fruitMap);

       /* Iterator<Map.Entry<String, Double>> iterator = fruitMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            String fruitName = entry.getKey();
            double price = entry.getValue();
            if ((fruitName.contains("a") || fruitName.contains("e")) && price > 8.0) {
                iterator.remove();*/


    }


}
