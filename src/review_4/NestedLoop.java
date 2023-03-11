package review_4;

public class NestedLoop {
    public static void main(String[] args) {



        // nested loop is loop inside another loop



        for (int i = 1; i < 5; i++) {     // outer loop
            System.out.println("Hello");


            for (int j = 1; j <= 2; j++) {  // inner loop  always depend on outer loop

                System.out.println("Bye");


            }


        }


        for (int i = 1; i < 5; i++) {     // outer loop
            System.out.println(i);


            for (int j = 1; j <= 2; j++) {  // inner loop  always depend on outer loop

                System.out.println(j);


            }
        }



        for (int k=1; k<=5; k++){

        for (int g=1; g<=5; g++){
            System.out.print(k+" ");
        }
        System.out.println();

    }

        //     VEHICLE ODOMETER


        for (int a = 0; a <= 9; a++) { // outer loop

            for (int b = 0; b <= 9; b++) { //inner loop

                for (int c = 0; c <= 9; c++) {

                    for (int d = 0; d <= 9; d++) {

                        System.out.println(a + " " + b + " " + c + " " + d);


                    }


                }

            }

        }
    }


    }
