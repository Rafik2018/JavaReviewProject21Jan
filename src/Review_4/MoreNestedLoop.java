package Review_4;

public class MoreNestedLoop {


    public static void main(String[] args) {

        System.out.println("What is a output");

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j < 2) {
                    continue;
                }
                    System.out.println("Hello");


                }
                System.out.println("Bye");

            }


        }


    }

