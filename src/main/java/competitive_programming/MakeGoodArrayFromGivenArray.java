package competitive_programming;

public class MakeGoodArrayFromGivenArray {

    public static void main(String[] args) {
        int a[] = {0, 1, 2, 3, 4, 0, 1, 0, 1, 2, 3, 4};
        int k = 5;

        int counter = a[0];
        int mismatch = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == counter++) {
                index++;
                continue;
            } else {
                //i = mismatch;
                counter = i;
                if (mismatch <= k) {
                    mismatch++;
                    //recount = a[i];
                }
            }

            System.out.println(mismatch);
        }


    }
}
