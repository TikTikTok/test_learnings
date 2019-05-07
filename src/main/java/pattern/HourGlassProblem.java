package pattern;

import java.util.Scanner;

public class HourGlassProblem {

    public static void main(String[] args) {

        // Here loop runs (R-2)*(C-2)
        // times considering different
        // top left cells of hour glasses.

        int max_sum = Integer.MIN_VALUE;
        System.out.println(" Enter the array size of an array ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int ar[][] = new int[size][size];
        for (int i = 0; i < size;  i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter the elements one by one ");
                ar[i][j] = scanner.nextInt();
            }

        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" "+ar[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < size-2; i++) {
            for (int j = 0; j < size-2; j++) {
                int sum = (ar[i][j] + ar[i][j + 1] +
                        ar[i][j + 2]) + (ar[i + 1][j + 1]) +
                        (ar[i + 2][j] + ar[i + 2][j + 1] +
                                ar[i + 2][j + 2]);

                // If previous sum is less then  
                // current sum then update 
                // new sum in max_sum 
                max_sum = Math.max(max_sum, sum);
                System.out.println(" Maximum sum  "+max_sum);
            }
        }
        System.out.println(" Maximum sum of hour of glass  "+max_sum);
    }
}
