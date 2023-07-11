package week07;

import java.util.Arrays;

public class Ivana_Solutions {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 23, 0, 200};

// 1. Find the minimum number in an Array

        System.out.println("minInAnArray(arr) = " + minInAnArray(arr));


// 2. Sort an Array in Ascending order without using Arrays.sort()

        System.out.println("sortInAscendingOrder(arr) = " + Arrays.toString(sortInAscendingOrder(arr)));


// 3. Sort an Array in Descending order without using Arrays.sort()

        System.out.println("sortInDescendingOrder(arr) = " + Arrays.toString(sortInDescendingOrder(arr)));


    }


    public static int minInAnArray(int[] arr) {

        int minNumber = arr[0];

        for (int each : arr) {
            if (each < minNumber) {
                minNumber = each;
            }
        }

        return minNumber;
    }


    public static int[] sortInAscendingOrder(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temporary = 0;
                if (arr[i] < arr[j]){
                    temporary = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temporary;
                }
            }
        }

        return arr;

    }



    public static int[] sortInDescendingOrder(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temporary = 0;
                if (arr[i] > arr[j]){
                    temporary = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temporary;
                }
            }
        }

        return arr;


    }


}
