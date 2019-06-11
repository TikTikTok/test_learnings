package verifone_code_challenge;

public class ArrayValueEqualityWithOtherArray {

    public static void main(String[] args) {

        int ar[] = new int[]{1,2,3,4,5};

        int temp[] = new int[ar.length];

        for (int i = 0; i < temp.length ; i++) {
            System.out.println(temp[ar[i]]== 1);
        }


    }

}
