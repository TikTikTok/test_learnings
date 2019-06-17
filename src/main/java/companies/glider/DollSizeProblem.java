package companies.glider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class DollSizeProblem {

    public static void main(String[] args) {

        int ar[] = {5, 2, 3, 3, 3, 3, 3, 2, 3};
        //Arrays.sort(ar);
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < ar.length; i++) {
            if (map.containsKey(ar[i])) {
                if (max < map.get(ar[i]) + 1)
                    max = map.get(ar[i]) + 1;
                map.put(ar[i], max);
            } else {
                map.put(ar[i], 1);
            }
        }
        map.forEach((key, value) -> System.out.println(" Element: " + key + " Count: " + value));
        System.out.println(" Max no of dolls " + max);
    }
}
