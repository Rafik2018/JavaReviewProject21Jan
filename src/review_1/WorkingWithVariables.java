      package review_1;


      public class WorkingWithVariables {

      public static void main(String[] args) {


        // create a variable and store value into it
        // declare a variable and initialization it

        int number=10;

        // declare a variable

        int num; // declaration of a variable happens only once
        num=100; // initialization the variable
        num=200; // reassign the variable;
        num = 2000;
        num = 5000;

        System.out.println(num); // 5000

        boolean hungry = false;
        hungry = true;

        // hungry= "yes" ; error

        // String is the most popular datatype

        String myString="Hello";
        String name= "Rafik";
        String address = "123 Test Drive";

        // Hello Rafik

          System.out.println(myString+" "+name);
           int age=42;

        // Artem is 21 years old

          System.out.println(name +" is "+age);



       /* if we want to attach String to anything;

       string to another String
       string to int
       String to boolean
       string to char........

       we use + --> acts as concatenation

       */


        // when we have 2 numeric values + acts as addition

        System.out.println(number+num);

        String n1="10";
        System.out.println(n1+num);


        String month="December";

        int day=14;

        // 14 December
        System.out.println(day+" "+month);

         char date = '1';    // 63   char + int = ASCII Table  specific number  behind the scene numeric value
        System.out.println(date+" "+month); // no concatenation (attaching)

        System.out.println(date+day);







    }











}

