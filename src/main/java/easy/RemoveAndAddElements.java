package easy;

import java.util.Scanner;

public class RemoveAndAddElements {

    public static void main(String[] args) {

        System.out.println(" Enter the no of elements in the array ");
        Scanner scanner = new Scanner(System.in);

        int ar[] = {3,5,3,5,5,11,5};
        int flag = 1;
        int loc = 0;

        System.out.println(" Enter the number to be removed ");
        int remove = scanner.nextInt();

        for (int i = 0; i < 7; i++) {
            if (ar[i] == remove)
            {
                flag =1;
                loc = i;
            }else {
                flag =0;
            }
        }

        if(flag ==1)
        {
            for (int i = ar.length-1 ; i <=0 ; i++) {
                ar[i-1] = ar[i];
            }

            System.out.print("After Deleting:");
            for (int i = 0; i < ar.length-2; i++)
            {
                System.out.print(ar[i]+",");
            }
            System.out.print(ar[ar.length-2]);
        } else
        {
            System.out.println("Element not found");
        }
    }
}
