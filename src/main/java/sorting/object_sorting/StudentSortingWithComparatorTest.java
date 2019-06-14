package sorting.object_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSortingWithComparatorTest {

    public static void main(String[] args) {

        Student s1 = new Student("Chandan", 27);
        Student s2 = new Student("Rohit",23);
        Student s3 = new Student("Amit",24);
        Student s4 = new Student("Sivasankar",30);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Collections.sort(students, new StudentSortingWithNameComparator());

        students.forEach(s -> System.out.println(" Name : "+ s.name +" Age : "+s.age));

        Collections.sort(students, new StudentSortingWithAgeComparator());

        students.forEach(s-> System.out.println(" Age: "+s.age));

    }
}
