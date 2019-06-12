package verifone_code_challenge;

import java.util.HashMap;

class CountIndex {
    int index, count;

    CountIndex(int index) {
        this.count = 1;
        this.index = index;
    }

    public void incCount() {
        this.count++;
    }
}

public class FindFirstNonRepeatingCharWithHashNap {

    static final int NO_OF_CHARS = 256;
    static HashMap<Character, CountIndex> characterCountIndexHashMap = new HashMap<>();

    static void getNonRepeatingChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (characterCountIndexHashMap.containsKey(str.charAt(i))) {
                characterCountIndexHashMap.get(str.charAt(i)).incCount();
            } else {
                characterCountIndexHashMap.put(str.charAt(i), new CountIndex(i));
            }
        }
    }

    static int firstNonRepeatingChar(String str) {
        getNonRepeatingChar(str);

        int result = Integer.MAX_VALUE, i=0;



        for (int j = 0; j < str.length(); j++) {
            int counts = characterCountIndexHashMap.get(str.charAt(i)).count;
            int indexes = characterCountIndexHashMap.get(str.charAt(i)).index;

            System.out.println(counts+" "+indexes);
            if (counts ==1 && result > indexes)
            {
                result = characterCountIndexHashMap.get(str.charAt(i)).index;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int index = firstNonRepeatingChar(str);
        System.out.println(index);

        System.out.println(index == -1 ? "Either all characters are repeating or string " +
                "is empty" : "First non-repeating character is " +  str.charAt(index));
    }
}
