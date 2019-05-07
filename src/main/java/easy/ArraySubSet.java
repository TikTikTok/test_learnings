package easy;

public class ArraySubSet {

    static int ar[] = {1,2,3,4,5};
    //static int sum = 0;

    public static void main(String[] args) {

        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            count++;

            //if (count ==)
            for (int j = i+1 ; j < ar.length ; j++) {

                int sum =0;
                sum = sum+ ar[i] + ar[j];
                System.out.println(sum);
            }
        }
    }
}
