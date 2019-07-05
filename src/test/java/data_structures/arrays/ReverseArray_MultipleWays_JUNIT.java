package data_structures.arrays;

import data_stuctures.arrays.ReverseArray_MultipleWays;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ReverseArray_MultipleWays_JUNIT {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void reverseArray() {
        String value = "5 4 3 2 1";
        String noOfElements = "5";
        int arr[] = {1, 2, 3, 4, 5};
        int actual[] = ReverseArray_MultipleWays.getInts(value, noOfElements);
        for (int i = 0; i < Integer.parseInt(noOfElements); i++) {
            Assert.assertEquals(arr[i], actual[i]);
        }
    }

    @Test
    public void reverseArrayFailTest() {

        expectedException.expect(AssertionError.class);
        expectedException.expectMessage("expected:<1> but was:<2>");

        String value = "5 4 3 1 2";
        String noOfElements = "5";
        int arr[] = {1, 2, 3, 4, 5};
        int actual[] = ReverseArray_MultipleWays.getInts(value, noOfElements);
        for (int i = 0; i < Integer.parseInt(noOfElements); i++) {
            Assert.assertEquals(arr[i], actual[i]);
        }
    }

}
