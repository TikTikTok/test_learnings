package companies.eka_software;

import java.util.Scanner;

public class BookShelfProblem {

    static int shelf[] = {3, 5, 1, 7};
    static int shelfNo[] = new int[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Do you want to add elemnent : (Yes/No) ? ");
        String addOrRemove = sc.next();
       /* if (("Y".equals(addOrRemove.toUpperCase())) || ("y".equals(addOrRemove.toLowerCase()))) {
            System.out.println(" Enter the shelf no: ");
            for (int i = 0; i < 3; i++) {
                shelfNo[i] = sc.nextInt();
            }
            System.out.println(" Enter the data ");
            for (int i = 0; i < shelfNo.length; i++) {
                pushBookToShelf(shelfNo, sc.nextInt());
            }
        }
*/
        if (("N".equals(addOrRemove.toUpperCase())) || ("n".equals(addOrRemove.toLowerCase()))) {

            System.out.println(" Enter the shelf no: ");
            for (int i = 0; i < 3; i++) {
                int data = sc.nextInt();
                popBooks(data);
            }
        }

        for (int i = 0; i < shelf.length; i++) {
            System.out.println(" Pring :" + shelf[i]);
        }
    }

    public static void popBooks(int data) {
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] == data) {
                shelf[i] = 0;
                for (int j = i; j < shelf.length-i ; j++) {
                    shelf[j]= shelf[j+1];
                }
               shelf[shelf.length-1]=0;
            } /*else {
                for (int i = 0; i < shelf.length; i++) {
                    shelf[shelfNumber[i]] = data;
                    for (int j = 0; j < shelf.length; j++) {
                        if (shelf[j] == 0) {
                            shelf[j] = shelf[shelfNumber[i]];
                            shelf[shelfNumber[i]] = 0;
                            break;
                        }
                    }
                    break;
                }
            }*/
        }
    }


    public static void pushBookToShelf(int shelfNumber[], int data) {
        if (shelf[0] == 0) {
            shelf[0] = data;
        } else {
            for (int i = 0; i < shelf.length; i++) {
                shelf[shelfNumber[i]] = data;
                for (int j = 0; j < shelf.length; j++) {
                    if (shelf[j] == 0) {
                        shelf[j] = shelf[shelfNumber[i]];
                        shelf[shelfNumber[i]] = 0;
                        break;
                    }
                }
                break;
            }
        }
    }



}


