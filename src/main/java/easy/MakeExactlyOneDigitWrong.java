package easy;

import java.util.Random;
import java.util.Scanner;

public class MakeExactlyOneDigitWrong {

    public void stringValueOf()
    {
        String a = String.valueOf(5858);
        String b = String.valueOf(1234);

        char[] ara  = a.toCharArray();
        char[] arb = b.toCharArray();

        int c = 5858 - 1234;

        System.out.println(c);
    }

    public static void main(String[] args) {

        int c = 5858 - 1234;
        String d = String.valueOf(c);
        char[] e = d.toCharArray();
        int min = 0, max = e.length;
        Random randomIndex = new Random();
        randomIndex.nextInt(((max - min)+1) + min);

        for(int i=0;i<e.length;i++)
        {

        }
        System.out.println(d);
    }
}
