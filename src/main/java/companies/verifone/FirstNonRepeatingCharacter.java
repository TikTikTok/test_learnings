package companies.verifone;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String str = "GeeksforGeeks";
        char repeatedChar = '\0';
        char chArr[] = str.toCharArray();
        char ch[] = new char[256];

        for (int i = 0; i < chArr.length ; i++) {
            boolean repeatFlag = false;
            for (int j = i+1 ; j < chArr.length ; j++) {
                if (chArr[j]==chArr[i])// G==e. G==e, .....G==G
                {
                    repeatedChar = chArr[i];
                    repeatFlag = true;
                }else {

                }
            }

            if (repeatFlag == true)
            {
                ch[i] = repeatedChar;
            }
        }

        for (int i = 0; i < chArr.length ; i++) {
            System.out.print(ch[i]+" ");
        }
    }
}
