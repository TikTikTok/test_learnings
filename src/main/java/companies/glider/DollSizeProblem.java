package companies.glider;

import java.util.Arrays;
import java.util.HashMap;

public class DollSizeProblem {

    public static void main(String[] args) {

        System.out.println(" start ");
        int ar[] = {5, 2, 3, 2, 3};
        Arrays.sort(ar);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                map.put(ar[i], map.get(ar[i])+1);
            } else {
                map.put(ar[i], 1);
            }
        }


        map.forEach((key, value) -> System.out.println(" Element: " + key + " Count: " + value));
    }
}
