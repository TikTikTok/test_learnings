package competitive_programming;

import java.util.Arrays;

public class FindMinDifferenceBTW_ArrElement_1 {

    public static void main(String[] args) {

        int arr[] = {3, 5, 9, 11, 0, 7, 1};
        int min = FindMinDifferenceBTW_ArrElement_1.findMinimumDiffElement(arr);
        System.out.println(" One-Way: Minimum Value is : " + min);
        System.out.println(" =================================================== ");
        int value = FindMinDifferenceBTW_ArrElement_1.findMinDiff(arr, arr.length);
        System.out.println(" Second-Way: Minimum Value is : " +value);
    }

    static int findMinDiff(int[] arr, int n) {
        // Sort array in non-decreasing order
        Arrays.sort(arr);

        // Initialize difference as infinite
        int diff = Integer.MAX_VALUE;

        // Find the min diff by comparing adjacent
        // pairs in sorted array
        for (int i = 0; i < n - 1; i++)
            if (arr[i + 1] - arr[i] < diff)
                diff = arr[i + 1] - arr[i];

        // Return min diff
        return diff;
    }

    public static int findMinimumDiffElement(int arr[])
    {
        int result = 0;
        int min = 100000;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    result = arr[i] - arr[j];
                else
                    result = arr[j] - arr[i];
                if (i == 0 && j == 1)
                    min = result;
                else if (result < min) {
                    min = result;
                }
            }
        }
        return min;
    }
}
