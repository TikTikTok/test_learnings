package hashmap_unmodifiable_implementation;

import java.util.Collections;
import java.util.Map;

public class UnmodifiableHashMap {

        private final Map<String, String> stringStringMap;

        public UnmodifiableHashMap(Map<String, String> stringMap)
        {
            this.stringStringMap = Collections.unmodifiableMap(stringMap);
        }

        public Map<String, String> getStringStringMap()
        {
            return stringStringMap;
        }
}
