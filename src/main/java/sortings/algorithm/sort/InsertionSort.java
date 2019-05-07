package sortings.algorithm.sort;

public class InsertionSort {

    public static void main(String[] args) {
        int ar[] = {9, 2, 4, 7, 5};

            for (int i = 0; i < ar.length; i++) {

                int temp =  ar[i];
                int j = i;

                while ( j >= 0 && ar[j-1] > ar[i])
                {
                    ar[j] = ar[j-1];
                    j = j-1;
                    System.out.println( " j Value is "+j);
                }

                ar[j+1] = temp;

                System.out.println(" second loop ");
            }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
