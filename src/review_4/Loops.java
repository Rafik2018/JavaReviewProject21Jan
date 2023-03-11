package review_4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

/*
        int a = 0;
        while (a <= 3) {
            System.out.println("I am while loop ");
            a++;
        }*/

// while whe we do not know how many times we need to repeat a block of code

        int b = 1;
        do {
            System.out.println("do while");
            b++;
        } while (b >= 3);

// ask students if they understand loops?
// if they do not -- tell them to practice more on loops
// if they understand -- you good move to array concept

Scanner scan=new Scanner(System.in);
String answer;


        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Do you understand loops in Java");
        answer = scanner.nextLine();
    }while (!answer.equalsIgnoreCase("yes"));


        System.out.println("Great job lets learn arrays now");














    }

}
