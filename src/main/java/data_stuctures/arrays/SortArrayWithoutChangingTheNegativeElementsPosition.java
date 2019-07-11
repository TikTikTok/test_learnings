package data_stuctures.arrays;

import sortings.algorithm.sort.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayWithoutChangingTheNegativeElementsPosition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the elements one by one with single space ");
        String elements = scanner.nextLine();
        String strArr[] = elements.split(" ");

        int arr[] = new int[strArr.length];
        int arrCopy[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
            arrCopy[i] = Integer.parseInt(strArr[i]);
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (arrCopy[i] > arr[i]) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] > arr[i]) {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            break;
                        }
                    }
                } else {
                    arr[i] = arrCopy[i];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.println();
    }
}
