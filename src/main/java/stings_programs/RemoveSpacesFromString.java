package stings_programs;

import java.util.Stack;

public class RemoveSpacesFromString {

    public static void main(String[] args) {

        String str = "   India     Is My    Country  ";

        String result = str.replaceAll("\\s+", " ");
        String replaceNumbers = "Hello 123Chandan ho5 are y09".replaceAll("[0-9]","s");
        System.out.println(replaceNumbers);
        String replaceSpaces = "   India     Is My    Country hello ".replaceAll(" {3,}", " ");
        System.out.println(replaceSpaces);



        char[] arr = str.toCharArray();

        Stack stack = new Stack();

        System.out.println(str.trim());
        System.out.println(result);
        System.out.println(result.trim());
       /* for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != ' ')
            {
                stack.push(arr[i]);
            }else {

            }
        }*/

    }
}
