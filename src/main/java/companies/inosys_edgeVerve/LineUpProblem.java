package companies.inosys_edgeVerve;

import java.util.Scanner;

public class LineUpProblem {

    public static void main(String[] args) {

        boolean gtTrue = false, ltTrue = false, sameTrue = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the No of students ");
        int noOfStudents = sc.nextInt();
        String students[] = new String[noOfStudents];
        System.out.println(" Enter the students name ");
        for (int i = 0; i < noOfStudents; i++) {
            students[i] = sc.nextLine().toLowerCase();
        }
        String order = getTheNamesOrder(gtTrue, ltTrue,students);
        System.out.println(" Names Order : " + order);
    }

    public static String getTheNamesOrder(boolean gtTrue, boolean ltTrue, String students[]) {

        char nameFirstLetters[] = new char[students.length];

        for (int i = 0; i < students.length; i++) {
            nameFirstLetters[i] = students[i].charAt(0);
        }

        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
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
            return "NEITHER";
        } else {
            if (ltTrue) {
                return "INCREASING";
            } else {
                return "DECREASIGN";
            }
        }
    }
}
