package sorting;

public class SelectionSortTest {

    static int arr[] = new int[]{20, 35, -15, 7, 55, 1, -22};
    static int arr1[] = new int[]{12, 545, 35, -15, 78, 55, 1, -22,-2222, 99};

    public static void main(String[] args) {

        selectionSortMethodOne(arr1);
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+", ");
        }
    }

    // method - 1
    private static void selectionSortMethodOne(int arr[]) {
        for (int lastIndex = arr.length-1; lastIndex >= 0; lastIndex--) {
           int largest = 0;
            for (int i = 1; i < lastIndex; i++) {
                if (arr1[i] > arr[largest]) {
                    largest = i;
                }
            }

            swap(arr, largest, lastIndex);

        }
    }

    public static void swap(int arr[], int i, int j) {
        if (i == j)
            return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
