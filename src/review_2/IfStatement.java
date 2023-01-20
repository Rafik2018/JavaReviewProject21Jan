package review_2;

public class IfStatement {
    public static void main(String[] args) {

     /* if statement - conditional statement
     if(boolean condition) {
     code;

     = assignment operator  = relational operator

     }
         */
     // >, >=, <, <=, !=, ==

        //int-boolean
        int day = 2;


        //False//
        if (day == 1) {

            System.out.println("It is the first day of the month");
        }


        String month = "December";
        //True//
        if (month.equals("December")) {
            System.out.println("It is a Christmas time");
        }


        boolean evening = true; // boolean use == in if condition
        //True//
        if (evening == true) {
            System.out.println("I might have a class at Syntax");


        }
    }

}
