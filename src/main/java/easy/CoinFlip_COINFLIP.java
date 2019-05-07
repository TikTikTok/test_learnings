package easy;

import java.util.Scanner;

public class CoinFlip_COINFLIP {

    public static void main(String[] args) {
        System.out.println(" Enter the no of test cases ");
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int number = 0, played = 0, head = 0, headOrTail=0, resulTantTail=0;
        for (int i = 0; i < testCases; i++) {

            System.out.println(" Enter the no of tests array to be taken ");
            int noOfArray = scanner.nextInt();

            for (int j = 0; j < noOfArray; j++) {
                System.out.println(" Enter the size of an array ");
                int sizeOfArray = scanner.nextInt();
                int temp[] = new int[sizeOfArray];
                System.out.println(" Enter the inputs for the array ");
                for (int k = 0; k < sizeOfArray; k++) {
                        number = scanner.nextInt();
                    System.out.println(" no of times played game ");
                    played = scanner.nextInt();
                    System.out.println(" head ");
                    head = scanner.nextInt();
                    if(head == 1)
                    {
                        resulTantTail = played/head;
                    }






                }
                System.out.println(" Results head "+ head+" tail ");
            }
        }

    }
}
