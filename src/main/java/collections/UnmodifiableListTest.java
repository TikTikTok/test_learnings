package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableListTest {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("chandan", "singh");
        map.put("rohit", "sharma");
        map.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
        Map finalMap = Collections.unmodifiableMap(map);
        /*finalMap.put("Hello", "You");
        finalMap.forEach((k,v) -> System.out.println(" key "+k+" value "+v));*/

        final HashMap<String, String> customFinalMap = new HashMap<>();
        customFinalMap.put("chandan", "singh");
        customFinalMap.put("rohit", "sharma");
        customFinalMap.forEach((k,v) -> System.out.println(" key "+k+" value "+v));
        customFinalMap.put("Hi","how");
        customFinalMap.forEach((k,v) -> System.out.println(" key "+k+" value "+v));

        System.out.println(" ................................ ");
        HashMap<String, String> hashMap = new HashMap<String, String>()
        {{
            put("hello","how");
            put("hi","how");
            put("what","are you doing");
        }};

        hashMap.forEach((k,v)-> System.out.println(" key is "+k+" and value is "+v));

        System.out.println(" addition of an item ");

        hashMap.put("add","new  Item");

        hashMap.forEach((k,v)-> System.out.println(" key is "+k+" and value is "+v));

        System.out.println(" ------------------------------- ");

    }
}
