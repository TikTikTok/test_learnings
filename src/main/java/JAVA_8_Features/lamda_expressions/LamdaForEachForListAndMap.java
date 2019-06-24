package JAVA_8_Features.lamda_expressions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LamdaForEachForListAndMap {

    public static void main(String[] args) {

        int factor = 2;

        List<Integer> resultedValues = new ArrayList<>();
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        System.out.println(values);


        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("A", "A");
        stringStringMap.put("B", "B");
        stringStringMap.put("C", "C");
        stringStringMap.put("E", "E");
        stringStringMap.put("F", "F");

        stringStringMap.forEach((k, v) -> System.out.println(" Key : " + k + " value " + v));

        values.forEach(item -> {
            int value = item.intValue();
            System.out.println(value);
        });

        System.out.println(" Before operation ");


        values.forEach(item -> {
            int value = item.intValue();
            int result = value / factor;
            resultedValues.add(result);
        });

    }
}
