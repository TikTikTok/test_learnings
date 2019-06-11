package collections;

public class RemoveArrayElement {

    public static void main(String[] args) {

         int  ar[] = {10,50,100,150};
        int arr[] = new int[ar.length-1];

        for (int i = 0; i < ar.length ; i++) {
            System.out.println(ar[i]);
        }

        System.out.println(" ----------------------------- ");
        for (int i = 0, k= 0; i < ar.length; i++) {
            if (ar[i]==100)

                continue;
                arr[k++] = ar[i];
            }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
