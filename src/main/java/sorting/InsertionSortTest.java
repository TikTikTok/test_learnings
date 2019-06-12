package sorting;

public class InsertionSortTest {

    public static void main(String[] args) {

        int ar[] = {5, 3, 7, 1, 9};

        for (int i = 0; i < ar.length; i++) {
            int temp = ar[i];
            int next = ar[i + 1];

            if (ar[i] > ar[i + 1]) {
                ar[i] = next;
                ar[i + 1] = temp;
            }
        }
    }
}
