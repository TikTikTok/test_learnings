package companies.amdocs;

public class MergeTwoUnsortedArray_2 {

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

        for (int i = 0; i < res.length; i++) {
            System.out.print(" i = " + i + ", ");
            for (int j = i + 1; j < res.length; j++) {
                System.out.print(" J = " + j + ", ");
                if (res[i] > res[j]) {
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
            System.out.println();
        }

        System.out.println(" ========= Sorted Array =========");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ", ");
        }
    }

}
