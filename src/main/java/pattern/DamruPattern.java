package pattern;

import java.util.Scanner;

public class DamruPattern {

    public static void main(String[] args) {
        System.out.println(" Enter the power of glass number ");
        Scanner  s = new Scanner(System.in);
        int power = s.nextInt();
        System.out.println();
        int max=Integer.MIN_VALUE;

        String space = " ";
        int counter = 0;
        for (int i = 0; i <= 9; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(space);
            }
            for (int j = i; j <= 9; j++) {
                System.out.print(j+"  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(space);
            }
            System.out.print(space);
            System.out.println("  ");
        }
    }
}
