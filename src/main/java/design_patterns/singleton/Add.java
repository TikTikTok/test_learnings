package design_patterns.singleton;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        String str = in.next();

        if (str.length() == length) {
            char[] arr = str.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                int count = 0;
                for (int j = 1; j < arr.length; j++) {

                    if (arr[i] < arr[j]) {
                        count++;
                    }
                }
                System.out.print(count);
            }
        } else {
            System.out.println(" length doesn't match ");
        }
        // String str = new in.next();
    }
}
