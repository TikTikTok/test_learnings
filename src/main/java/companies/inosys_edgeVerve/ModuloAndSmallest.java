package companies.inosys_edgeVerve;

import java.util.HashMap;

public class ModuloAndSmallest {

    public static void main(String[] args) {

        int arr[] = {3346, 7958, 6348, 9897};
        int counter = 2;

        int modulo = getCorrectModuloValue(arr, counter);
        System.out.println(" Modulo Value : "+modulo);
    }

    public static int getCorrectModuloValue(int[] arr, int counter) {
        for (int j = counter; j < 10; j++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                int modulo = arr[i] % j;
                if (map.containsKey(modulo)) {
                    break;
                } else {
                    map.put(modulo, 1);
                }
            }

            if (map.size() == arr.length) {
                System.out.println(" Module is : " + j);
                counter = j;
                return counter;
            }
        }
        return 0;
    }
}
