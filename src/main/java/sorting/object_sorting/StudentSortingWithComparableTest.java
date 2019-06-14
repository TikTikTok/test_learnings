package sorting.object_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortingWithComparableTest {

    public static void main(String[] args) {
        StudentSortingWithComparable s1 = new StudentSortingWithComparable("Chandan", 27);
        StudentSortingWithComparable s2 = new StudentSortingWithComparable("Rohit",23);
        StudentSortingWithComparable s3 = new StudentSortingWithComparable("Amit",24);
        StudentSortingWithComparable s4 = new StudentSortingWithComparable("Sivasankar",30);

        ArrayList<StudentSortingWithComparable> studentSortingWithComparableArrayList = new ArrayList<>();
        studentSortingWithComparableArrayList.add(s1);
        studentSortingWithComparableArrayList.add(s2);
        studentSortingWithComparableArrayList.add(s3);
        studentSortingWithComparableArrayList.add(s4);

        Collections.sort(studentSortingWithComparableArrayList);

        studentSortingWithComparableArrayList.forEach(s-> System.out.println(" Name : "+s.name +" Age : "+s.age));

    }
}
