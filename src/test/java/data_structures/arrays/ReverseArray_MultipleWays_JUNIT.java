package data_structures.arrays;

import data_stuctures.arrays.ReverseArray_MultipleWays;
import org.junit.Assert;
import org.junit.Test;

public class ReverseArray_MultipleWays_JUNIT {

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

}
