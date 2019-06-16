package companies.verifone;

public class FindFirstNonRepeatingCharacter {

    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];

    static void getCharCountArray(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
    }

    public static void main(String[] args) {

        String str = "geeksforgeeks";
        int index = firstNonRepeatingChar(str);
        System.out.println(index);

        System.out.println(index == -1 ? "Either all characters are repeating or string " +
                "is empty" : "First non-repeating character is " +  str.charAt(index));
    }

    static int firstNonRepeatingChar(String str)
    {
        getCharCountArray(str);
        int index =-1 , i;
        for (int j = 0; j < str.length() ; j++) {

            if (count[str.charAt(j)]==1)
            {
                index = j;
                break;
            }
        }
        return index;
    }
}
