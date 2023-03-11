package review_9;

import java.util.ArrayList;

public class ArrayListDemo {


    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);

        int size = arrayList.size();
        System.out.println("The size of arrayList is =" + arrayList);

        Integer firstElement = arrayList.get(0);

        arrayList.set(0, 120);
        System.out.println(firstElement);//12
        // replacing of the value first element
        arrayList.get(0);
        System.out.println(firstElement);

        arrayList.remove(2);
        System.out.println(arrayList);

    }


}
