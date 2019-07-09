package data_stuctures.arrays;

import java.util.Arrays;

public class SortArrayWithoutChangingTheNegativeElementsPosition {

    public static void main(String[] args) {

        int arr[] = {2, -6, -3, 8, 4, 1};
        int index[] = new int[arr.length];

        int res[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                index[i] = i;
            }
        }

        System.out.println();
        for (int i = 0; i < index.length; i++) {
            System.out.print(" Indexes : " + index[i]);
        }
        System.out.println();

        //Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (i == index[i] && i != 0) {
                System.out.println(" Hello ");
            } else {
                System.out.println(" Hi ");
                if (index[i] == 0) {

                    for (int j = 0; j < arr.length; j++) {
                        
                    }
                    index[i] = arr[i];
                }
            }
        }
    }
}
