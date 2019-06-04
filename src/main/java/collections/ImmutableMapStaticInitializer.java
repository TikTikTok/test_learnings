package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapStaticInitializer {

    private static final HashMap<String, String> map = new HashMap<String, String>(){{

        put("Hi","Hello");
    }};

    private static final Map<Integer, String> myMap2 = new HashMap<Integer, String>(){
        {
            put(1, "one");
            put(2, "two");
        }
    };

    public static void main(String[] args) {

    }
}
