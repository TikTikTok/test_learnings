package competitive_programming;

import java.util.ArrayList;

public class ArrayListCloneTest {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(5);
        a.add(6);

        for (Integer i : a) {
            System.out.println(i);
        }

        System.out.println();
        ArrayList<Integer> b = (ArrayList)a.clone();
        b.add(9);

        for (Integer i : b) {
            System.out.println(i);
        }

        b.remove(3);

        System.out.println();

        for (Integer i : b) {
            System.out.println(i);
        }

        System.out.println(" ------------------ ");

        b.remove(new Integer(5));

        System.out.println();

        for (Integer i : b) {
            b.remove(1);
            System.out.println(i);
        }

    }
}
