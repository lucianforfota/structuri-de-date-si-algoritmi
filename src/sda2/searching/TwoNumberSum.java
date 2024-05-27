package sda2.searching;

import java.util.Arrays;

public class TwoNumberSum {

    public static void main(String[] args) {
        int[] a = {7,2,5,4,1,6,0,3};
        int[] result1 = twoNumberSum(a,9);
        for (int i = 0; i < result1.length; i++) {
            System.out.println(result1[i]);
        }
        int[] result2 = twoNumberSum2(a,9);
        for (int i = 0; i < result2.length; i++) {
            System.out.println(result1[i]);
        }

    }


    public static int[] twoNumberSum (int[] array, int targetSum){

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum){
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return null;
    }


    public static int[] twoNumberSum2(int[] array, int target){
        Arrays.sort(array);
        int left = 0;
        int right = array.length-1;
        while (left<=right){
            int currentSum = array[left] + array[right];
            if (target == currentSum){
                return new int[]{array[left], array[right]};
            } else if (currentSum < target){
                left++;
            } else{
                right--;
            }
        }
        return null;
    }
}
