package sortings.algorithm.sort;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int ar[] = {6, 2, 8, 1, 8, 9, 4, 7, 3, 0};
        quickSort.quickSort(0, ar.length, ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }


    public int quickSort(int low, int high, int ar[]) {
        System.out.println(" quick swap started ");
        int pivot = ar[low];
        int i = low;
        int j = high - 1;

        while (i <= j) {
            while (ar[i] < pivot) {
                i++;
            }
            while (ar[j] > pivot) {
                j--;
            }

            if (i <= j) {
                if (ar[i] > ar[j]) {
                    swap(i, j, ar);
                }
            }
        }
        return j;
    }

    public void swap(int i, int j, int ar[]) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

}
