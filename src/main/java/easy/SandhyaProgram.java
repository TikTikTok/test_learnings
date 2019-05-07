package easy;

import java.util.Scanner;

public class SandhyaProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        String[] ones = Integer.toBinaryString(n).split("[0]+");
        int max= 0 ;

        for (String s : ones) {
            if (s.length() > max)
            {
                max = s.length();
            }
        }
      /*  for (String s: ones) {
            if (s.length() > max)
            max = s.length();
        }*/
        System.out.println(max);
    }
}
