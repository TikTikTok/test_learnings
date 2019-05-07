package java8.lamda.expression;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LamdaExpressionTest {


    public static void main(String[] args) {


    }

    @Test
    public void testSuccess() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);


        ArrayList<Integer> integers = getList();

        for (int i = 0; i < integers.size(); i++) {

            try {
                Assert.assertEquals(integers.get(i), arrayList.get(i));
            } catch (Exception e) {

            }
        }
    }


    public ArrayList<Integer> getList() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        return integerArrayList;
    }

    public void throwException() {

    }

}
