package sorting;

public class ShellSortTest {


    static int arr1[] = new int[]{545, 35, -15, 78, 55, 1, -22, -2222, 99};

    public static void main(String[] args) {

        insertionSortMethodOne(arr1);
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + ", ");
        }
    }


    public static void insertionSortMethodOne(int arr[]) {

        for (int gap = arr1.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < arr1.length; i++) {
                int newElement = arr1[i];

                int j = i;

                while (j >= gap && arr1[j - gap] > newElement) {
                    arr1[j] = arr1[j - gap];
                    j -= gap;
                }

                arr1[j] = newElement;

            }
        }
    }
}
