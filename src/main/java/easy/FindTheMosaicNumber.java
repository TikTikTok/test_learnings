package easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindTheMosaicNumber {

    public static void main(String[] args) {

        int n = 36;

        HashMap<Integer, Integer> map = getMosaicNumberFirstWay(n);

        //getMosaicNumberSecondBullShitWay(map);

        int sum = getMosaicNumber(map);

        System.out.println(" Mosaic Number : " + sum);
    }

    private static int getMosaicNumber(HashMap<Integer, Integer> map) {
        int sum = 1;

        map.forEach((x, y) -> System.out.println(" X is : " + x + " Y is :" + y));

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            sum = sum * (Integer) entry.getKey() * ((Integer) entry.getValue());
        }
        return sum;
    }

    /*private static void getMosaicNumberSecondBullShitWay(int n,HashMap<Integer, Integer> map) {
        while (n != 0) {
            if (n % 2 == 0) {
                int m = 2;
                n = n / 2;
                if (map.containsKey(m)) {
                    int value = map.get(2);
                    map.put(m, ++value);
                } else {
                    map.put(m, 1);
                }
            } else {
                if (n % 3 == 0) {
                    int m = 3;
                    n = n / 3;
                    if (map.containsKey(m)) {
                        int value = map.get(3);
                        map.put(m, ++value);
                    } else {
                        map.put(m, 1);
                    }
                } else {
                    if (n % 5 == 0) {
                        int m = 5;
                        n = n / 5;
                        if (map.containsKey(m)) {
                            int value = map.get(5);
                            map.put(m, ++value);
                        } else {
                            map.put(m, 1);
                        }
                    }
                }
            }

            if (n == 1) {
                break;
            }
        }
    }
*/


    private static HashMap<Integer, Integer> getMosaicNumberFirstWay(int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;


        for (int i = 2; i <= n; i++) {

            while (n % i == 0) {
                n = n / i;
                if (map.containsKey(i)) {
                    int value = map.get(i);
                    map.put(i, ++value);
                } else {
                    map.put(i, 1);
                }

                if (n==1)
                {
                    break;
                }
            }
        }
        return map;
    }
}
