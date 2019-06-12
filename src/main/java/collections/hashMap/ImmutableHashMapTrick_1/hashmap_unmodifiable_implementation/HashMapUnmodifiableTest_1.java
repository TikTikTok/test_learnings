package hashmap_unmodifiable_implementation;

import java.util.HashMap;
import java.util.Map;

public class HashMapUnmodifiableTest_1 {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("first","Chandan");
        UnmodifiableHashMap unmodifiableHashMap = new UnmodifiableHashMap(hashMap);
        Map<String, String> stringHashMap = unmodifiableHashMap.getStringStringMap();
        stringHashMap.put("Hi","Hello");// EXECEPTION: java.lang.UnsupportedOperationException. This map received from
                                        // UnmodifiableHashMap class and there it has been made unmodifiable with
                                        //the help of Collections util class
        hashMap.put("last", "Singh");

    }
}
