package companies.inosys_edgeVerve;

import java.util.Scanner;

public class LineUpProblem {

    public static void main(String[] args) {

        boolean gtTrue = false, ltTrue = false, sameTrue = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the No of students ");
        int noOfStudents = sc.nextInt();
        String students[] = new String[noOfStudents];
        char nameFirstLetters[] = new char[noOfStudents];
        System.out.println(" Enter the students name ");

        for (int i = 0; i < noOfStudents; i++) {
            students[i] = sc.next().toLowerCase();
            nameFirstLetters[i] = students[i].charAt(0);
        }

        for (int i = 0; i < noOfStudents; i++) {
            for (int j = i + 1; j < noOfStudents; j++) {
                boolean result = nameFirstLetters[i] > nameFirstLetters[j];
                if (result) {
                    gtTrue = true;
                } else {
                    if (nameFirstLetters[i] == nameFirstLetters[j]) {
                    } else {
                        ltTrue = true;
                    }
                }
            }
        }


        if (ltTrue && gtTrue) {
            System.out.println(" NEITHER ");
        } else {
            if (ltTrue) {
                System.out.println(" INCREASING  ");
            } else {
                System.out.println(" DECREASIGN ");
            }
        }
    }
}
