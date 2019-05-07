package sortings.algorithm.sort;

public class SelectionSort {

    public static void main(String[] args) {

        int ar[] = {9, 2, 4, 7, 5};

        int l = ar.length;
        for (int i = 0; i < l - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < l; j++) {
                if (ar[j] < ar[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first
            // element

            int temp = ar[min_idx];
            ar[min_idx] = ar[i];
            ar[i] = temp;
        }


        for (int i = 0; i < l; i++) {
            System.out.println(" print the elements in sorted : " + ar[i]);
        }
    }
}
