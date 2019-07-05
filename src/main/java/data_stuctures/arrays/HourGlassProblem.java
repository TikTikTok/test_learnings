package data_stuctures.arrays;

import java.util.Scanner;

public class HourGlassProblem {

    public static void main(String[] args) {
        System.out.println(" Enter the dimensions for the array ");
        Scanner scanner = new Scanner(System.in);
        int firstSize = scanner.nextInt();
        //int secondSize = scanner.nextInt();
        String str = scanner.nextLine();
        int[][] arr = getArrayPopulated(firstSize, firstSize, scanner);
        int result = getHourGlassMaxSum(arr);
        System.out.println(" Max of hour glass :" + result);
    }

    public static int[][] getArrayPopulated(int firstSize, int secondSize, Scanner scanner) {
        int[][] arr = new int[firstSize][secondSize];

        System.out.println(" Enter the elements of an array ");
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(" Row no: " + i);
            String[] arrRowItems = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < arr.length; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        return arr;
    }

    public static int getHourGlassMaxSum(int[][] arr) {
        int sum = 0, gt = 0, result = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 2; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                        arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (i == 0 && gt == result) {
                    result = sum;
                } else {
                    if (sum > result) {
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}
