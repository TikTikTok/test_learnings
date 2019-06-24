package companies.amdocs;

public class MergeTwoUnsortedArrays {

    public static void main(String[] args) {
        int arr1[] = {6, 3, 8, 4, 8};
        int arr2[] = {11, 9, 16, 8, 9, 22, 77};

        int res[] = new int[arr1.length + arr2.length];

        int count = 0;
        for (int i = 0; i < res.length; i++) {
            if (!(i < arr1.length)) {
                res[i] = arr2[count++];//4+5-5+1
            } else {
                res[i] = arr1[i];
            }
        }
        //Arrays.sort(res);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+", ");
        }
        System.out.println();

        System.out.println();
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+", ");
        }
    }
}
