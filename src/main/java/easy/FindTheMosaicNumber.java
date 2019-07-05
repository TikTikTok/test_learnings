package easy;

import java.util.HashMap;
import java.util.Map;

public class FindTheMosaicNumber {

    public static void main(String[] args) {

        int n = 20;

        HashMap<Integer, Integer> map = new HashMap<>();
        int counter = 0;

        while (n!=0)
        {
            if (n%2==0)
            {   int m =2;
                n = n/2;
                if (map.containsKey(m))
                {
                    int value = map.get(2);
                    map.put(m, ++value);
                }else {
                    map.put(m,1);
                }
            }else {
                if (n%3==0)
                {
                    int m = 3;
                    n = n/3;
                    if (map.containsKey(m))
                    {
                        int value = map.get(2);
                        map.put(m, ++value);
                    }else {
                        map.put(m,1);
                    }
                }else {
                    if (n%5==0)
                    {
                        int m=5;
                        n = n/5;
                        if (map.containsKey(m))
                        {
                            int value = map.get(2);
                            map.put(m, ++value);
                        }else {
                            map.put(m,1);
                        }
                    }
                }
            }

            if (n==1)
            {
                break;
            }
        }

        int sum = 1;

        for (Map.Entry<Integer, Integer>) 


    }
}
