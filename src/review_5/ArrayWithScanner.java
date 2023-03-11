package review_5;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names store");
        int size = scanner.nextInt();
        String[] name = new String[size];

        //  This loop stores elements inside the array
        // regular for loop work with indexes

        for (int i = 0; i < name.length; i++) {
            System.out.println("Please enter tne name ");
            name[i] = scanner.next();
        }


        // using loop below we can retrieve element
        // enhanced for loop work with variable

            for (String n : name) {
            System.out.println(n);

        }


    }

}
