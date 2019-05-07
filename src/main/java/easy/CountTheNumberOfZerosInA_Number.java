package easy;

import java.util.Scanner;

public class CountTheNumberOfZerosInA_Number {

    static int has0(int n)
    {
        while(n!=0)
        {
            if(n%10==0)
                return 1;
            n= n/10;
        }
        return n;
    }


    public static void main(String[] args) {

        int count =0;
        System.out.println(" Number of zeros in a number ");
        System.out.println(" Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        count = count++ + has0(n);

        System.out.println(" no of zeros in "+ n +" is "+ count);

    }
}
