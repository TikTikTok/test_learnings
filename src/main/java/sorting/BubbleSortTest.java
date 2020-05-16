package sorting;

public class BubbleSortTest {

    static int arr[] = new int[]{20, 35, -15, 7, 55, 1, -22};
    static int arr1[] = new int[]{545, 35, -15, 78, 55, 1, -22,-2222, 99};

    public static void main(String[] args) {

        bubbleSortMethod1();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }

        bubbleSortMethod2(arr1);
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+", ");
        }
    }

    // method - 1
    private static void bubbleSortMethod2(int arr[]) {
        for (int lastIndex = arr.length-1; lastIndex >= 0; lastIndex--) {
            for (int i = 0; i < lastIndex; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
        }
    }

    // method -2
    private static void bubbleSortMethod1() {
        for (int k = 0; k < arr.length; k++) {
            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (j == arr.length - 1) {
                    break;
                } else {
                    j = i + 1;
                    if (arr[i] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
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
