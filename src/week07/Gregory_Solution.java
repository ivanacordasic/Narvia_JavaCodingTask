package week07;

public class Gregory_Solution {

    public static void main(String[] args) {



    }
/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */
    public static int minimum (int[] num){
        int minNum = num [0];

        for (int each : num) {
            if(each < minNum){
                minNum = each;
            }

        }
        return minNum;
    }
    /*
    Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */
    public static int[] sortAscending (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int lowNum = 0;
                if(arr[i] < arr[j]){
                    lowNum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = lowNum;
                }
            }

        }
        return arr;
    }
    /*
    Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */
    public static int[] sortDescending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int lowNum = 0;
                if(arr[i] > arr[j]){
                    lowNum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = lowNum;
                }
            }

        }
        return arr;
    }
}
