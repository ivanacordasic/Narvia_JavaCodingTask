package week07;

import java.util.Arrays;

public class Kasim_Solution {

    public static int findMinimum(int[] numbers) {

        int minNum = numbers[0];

        for (int number : numbers) {

            if (number < minNum) {
                minNum = number;
            }
        }
        return minNum;
    }
    //----------------------------------------------------------------------
    public static String sortAscending(int[] numbers) {

        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int biggerNumber = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = biggerNumber;
                }
            }
        }
        return Arrays.toString(numbers);
    }

    //----------------------------------------------------------------------
    public static String sortDescending(int[] nums) {

        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {

                if (nums[j] < nums[j + 1]) {
                    int smallerNumber = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = smallerNumber;
                }
            }
        }
        return Arrays.toString(nums);
    }

}
