package sorting.object_sorting;

import java.util.Comparator;

public class StudentSortingWithAgeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;
        return student1.age == student2.age ? 0 : (student1.age > student2.age) ? 1 : -1;
    }
}
