package collections.LinkedHashMap_Iteration;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapIteratorTest {

    public static void main(String[] args) {

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1234", "One");

        LinkedHashMap<String, String> linkedHashMap1 = new LinkedHashMap<>();
        linkedHashMap1.put("2345", "One");

        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
        linkedHashMap2.put("3456", "Two");

        LinkedHashMap<String, String> linkedHashMap3 = new LinkedHashMap<>();
        linkedHashMap3.put("4567", "Two");

        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("1234", linkedHashMap);
        hashMap.put("2345", linkedHashMap1);
        hashMap.put("3456", linkedHashMap2);
        hashMap.put("4567", linkedHashMap3);

        Set entries = hashMap.keySet();

        String checkValue = null;

        for (Object str : entries) {
            String key = (String) str;
            System.out.println(key);
            LinkedHashMap<String, String> value = (LinkedHashMap<String, String>) hashMap.get(key);
            System.out.println(value);

            Set set = value.keySet();
            String dup = null;
            for (Object obj : set) {
                String key1 = (String) obj;
                System.out.println(key1);
                checkValue = value.get(key1);
                System.out.println(dup);
            }
            System.out.println(" -------------- ");
        }
    }
}
