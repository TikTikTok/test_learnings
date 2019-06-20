package companies.geeksforgeeks;

import java.util.HashMap;

public class FindKthUniqueElement {

    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 3, 4, 2};
        int counts[] = new int[arr.length];
        int kth = 2;
        HashMap<Integer, Integer> map = new HashMap<>();//

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            if (map.containsKey(arr[i]))// 1
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1); // 1,1.... 2,1... 1,2...
            }
        }
        map.forEach((key, value) -> System.out.println(" Key :" + key + " Value :" + value));

        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }
    }
}
