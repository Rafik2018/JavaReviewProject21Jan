package review_5;

public class Task_8 {

    public static void main(String[] args) {


      //  8) Write a Java Program to print the first 10 numbers of Fibonacci series.



        int a =0;
        int b= 1;
        int c;


        for (int i=1; i<10; i++){

            c=a+b;
            System.out.println(c+" ");



            a=b;
            b=c;




        }







    /*
        int[][] arr = {{0, 1, 1, 2, 3, 55, 89, 144, 233, 377},
                {5, 8, 13, 21, 34, 610, 987, 1597, 2584, 4181}};

        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}

*/
    }



}
