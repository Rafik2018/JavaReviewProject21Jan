package review_5;

public class Task_4 {
    public static void main(String[] args) {


        int[][] numbers = {{1, 2, 3}, // 0
                {11, 12, 13},      // 1
                {20, 21, 22},    //  2
                {100, 101}};

        int sum = 0;
        for (int[] nums : numbers) {
            for (int num : nums) {

                sum += num;


            }

        }
    }

}
