package review_9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        List<String> computer=new ArrayList<>();
        computer.add("Macbook Pro");
        computer.add("HP");
        computer.add("Lenovo");
        computer.add("Dell");
        System.out.println(computer);

        for (int i=0; i<computer.size(); i++){
            String c=computer.get(i);
            System.out.println(c);
        }
        System.out.println("-------------------");

        for (String  c:computer){
            System.out.println(computer);
        }

    }
}







