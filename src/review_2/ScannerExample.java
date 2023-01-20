package review_2;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        int i=10;
            i=11;


        // non-primitive variable=scanner
       Scanner keyboard=new Scanner(System.in);  //

        int age=keyboard.nextInt(); // to capture int value

        boolean tired=keyboard.nextBoolean(); // to capture boolean value

        String name=keyboard.next(); // to capture String until spare

        System.out.println("Please enter your age");
        System.out.println("Are you tired");
        System.out.println("What is your name");


    }
}
