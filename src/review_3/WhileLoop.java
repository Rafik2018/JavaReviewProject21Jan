package review_3;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

/*

   int i =1;
   while (i<=4){
       System.out.println("Hello");
       i++;
*/

     for (int i =1; i<=4; i++){
         System.out.println("Hi");


         Scanner scanner=new Scanner(System.in);
         System.out.println("Are you tired");

         boolean tired=scanner.nextBoolean();

         while (!tired){

             System.out.println("It is great");
             System.out.println("Lets study Java");
             System.out.println("Are you tired");
             tired=scanner.nextBoolean();
             System.out.println();
         }
     }






















    }





}
