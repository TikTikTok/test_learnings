package data_structures.arrays;

import data_stuctures.arrays.HourGlassProblem;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class HourGlassProblemTest {

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void hourGlassProblemSuccessTest()
    {
        int arr_test1_data[][] = { {1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int arr_test2_data[][]= {{-1,-2,-3,-4,-5},{-1,-2,-3,-4,-5},{-1,-2,-3,-4,-5},{-1,-2,-3,-4,-5},{-1,-2,-3,-4,-5}};
        int actual_test_1 = HourGlassProblem.getHourGlassMaxSum(arr_test1_data);
        int expected_test1 = 28;
        Assert.assertEquals(expected_test1,actual_test_1);

        int expected_test2 = -14;
        int actual_test_2 = HourGlassProblem.getHourGlassMaxSum(arr_test2_data);
        Assert.assertEquals(expected_test2,actual_test_2);
    }

    @Test//(expected = ArrayIndexOutOfBoundsException.class)
    public void hourGlassProblemFailureTest()
    {
        thrown.expect(ArrayIndexOutOfBoundsException.class);
        thrown.expectMessage("4");
        int arr_test1_data[][] = { {1,2,3,4,},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int actual_test_1 = HourGlassProblem.getHourGlassMaxSum(arr_test1_data);
        int expected_test_1 = 28;
        Assert.assertEquals(expected_test_1,actual_test_1);
    }

}
