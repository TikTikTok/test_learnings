package easy;

import java.util.Scanner;

public class NoOfZerosInAFactorial {

    public static int factorial(int n)
    {
        if(n==0)
            return 1;
        //System.out.println(n);
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(" Enter the number of iterations ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int j=0;j<n ; j++)
        {
            System.out.println(" Enter the number ");
            int no = s.nextInt();
            int num = factorial(no);

            int count = 0;
            for(int i=5; no/i > 0 ; i = i*5)
            {
                count = count + no/i;
            }

            System.out.println(" Factorial of "+ no +" is "+ num +" and number of zeros in "+ count);
        }
    }
}
