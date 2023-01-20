       package review_1;

       public class WhatIf {
       public static void main(String[] args) {

        int a=10;
        int b=20;

        String c="Hello";
        String d="Java";

           System.out.println(a+b+c+d); //  30HelloJava    a10+b20 = 30int (add)  30+c is String d is String
           System.out.println(a+c+d+b); //  10HelloJava20
           System.out.println(c+d+a+b); //  HelloJava1020   c+d String + a is int10  HelloJava10+b String+int
           System.out.println(c+d+(a+d)); // HelloJava30    (c+d+(a+d)) (a+d) priority

           // Arithmetic Operation: how does it work   1. *     2. /      3. +     4. -    5.%


        //     c and d=HelloJava               +10
        //            String                   int
        //           HelloJava                 0+b
        //            String                   int















    }






}







