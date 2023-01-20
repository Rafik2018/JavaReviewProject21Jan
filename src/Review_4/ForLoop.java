package Review_4;

public class ForLoop {

    public static void main(String[] args) {

// best loop - used when we know how many times we want to repeat block of code


        for (int i = 2; i <= 20; i += 5) {   // increment by 5 from 2 to 5

            System.out.println(i);                          // loop stop execute 1 time    only number 2} without if
            if (i == 12) {
                System.out.println("i is equal to 12 -I am breaking my loop");
                break;

            }
            // break and continue

        }

// continue - skip current iteration

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                continue;
            }

            System.out.println("Hello");
            System.out.println("How are you");
            System.out.println("Hope you well");
            break;                                         // have different condition for break


        }

    }

}
