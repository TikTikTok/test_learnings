package sorting;

public class InsertionSortTestMethodsTest {

    static int arr1[] = new int[]{545, 35, -15, 78, 55, 1, -22,-2222, 99};

    public static void main(String[] args) {

        insertionSortMethodOne(arr1);
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+", ");
        }
    }

    
    public static void insertionSortMethodOne(int arr[]) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr1.length-1; firstUnsortedIndex++) {
            int newElement = arr1[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && arr1[i-1] > newElement ; i--) {
                System.out.println(" arr1[i-1]--"+arr1[i-1]);
                arr1[i] = arr1[i-1];
            }

            arr1[i] = newElement;

        }
    }
}
