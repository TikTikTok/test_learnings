package data_stuctures.arrays;

import java.util.Stack;


public class ReverseArray_MultipleWays {

    // reverse array with new array
    public static int[] reverseArray(int[] a) {

        int result[] = new int[a.length];

        int counter = 0;
        for (int i = 0; i < a.length; i--) {
            result[counter++] = a[i];
        }
        return result;
    }

    // reverse array without new array
    public static int[] reverseArrayWithoutNewArray(int[] arr) {

        int length = 0;
        if (arr.length % 2 == 0) {
            length = arr.length / 2;
        } else {
            length = arr.length / 2 + 1;
        }
        for (int i = 0; i < length; i++) {
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // reverse array with stack
    public static int[] reverseArrayWithStack(int[] arr) {
        Stack stack = new Stack();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Integer) stack.pop();
        }

        return arr;
    }

    public static void printReversedArray(int[] res) {
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] getInts(String arrItems, String items) {

        int arr[] = new int[Integer.parseInt(items)];
        for (int i = 0; i < arr.length; i++) {
            int arrItem = Integer.parseInt(arrItems.split(" ")[i]);
            arr[i] = arrItem;
        }

        //        reverseArray(arr);
        //        reverseArrayWithoutNewArray(arr);
        return reverseArrayWithoutNewArray(arr);
    }
}

