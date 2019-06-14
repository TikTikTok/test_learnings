package sorting.object_sorting;

public class StudentSortingWithComparable implements Comparable {

    String name;
    int age;

    public StudentSortingWithComparable(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        StudentSortingWithComparable studentSortingWithComparable = (StudentSortingWithComparable)o;
        return this.age == studentSortingWithComparable.age ? 0 : (this.age > studentSortingWithComparable.age) ? 1 : -1;
    }
}
