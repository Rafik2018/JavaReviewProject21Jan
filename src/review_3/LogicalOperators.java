package review_3;

public class LogicalOperators {
    public static void main(String[] args) {


        boolean cold = true;
        boolean rain = true;

        if (cold && rain) {
            System.out.println("I will stay at home");


            System.out.println("------------------------------------");


            boolean loginButtonDisplayed = true;
            boolean loginButtonClickable = false;

            if (loginButtonDisplayed && loginButtonClickable) {
                System.out.println("Test case is passed");
            } else {
                System.out.println("Test case failed");


                System.out.println("------------------------------------");


                boolean dashboard = false;
                String message = "Welcome admin";

                if (dashboard || message.equals("Welcome admin")) {
                    System.out.println("User is successfully logged in");
                } else {
                    System.out.println("User is not logged in");

                }
            }


            System.out.println("---------------------------");


            boolean dashboard1 = false;
            String message1 = "Hello";

            if (dashboard1 || message1.equals("Welcome admin")) {
                System.out.println("User is successfully logged in");
            } else {
                System.out.println("User is not logged in");


                System.out.println("--------------------------");


                boolean b = true;
                System.out.println(!true); //false

                boolean agreeCheckboxSelected = false; // false

                if (!agreeCheckboxSelected) { // false

                    System.out.println("I am clicking on checkbox");
                }

                System.out.println("I am clicking on submit button");
            }


            boolean boo = !false;          // !FALSE=====TRUE
            System.out.println(boo);




        }
    }


}










