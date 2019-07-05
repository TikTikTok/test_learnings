package companies.inosys_edgeVerve;


import org.junit.Assert;
import org.junit.Test;

import static companies.inosys_edgeVerve.ModuloAndSmallest.getCorrectModuloValue;

public class FindModuloTest {

    @Test
    public void findModuloSuccessTest1()
    {
        int arr[] = {3346, 7958, 6348};
        int counter = 2;
        int expectedModuloValue = 3;
        int actualModuloValue = getCorrectModuloValue(arr, counter);
        Assert.assertEquals(expectedModuloValue,actualModuloValue);
    }

    @Test
    public void findModuloSuccessTest2()
    {
        int arr[] = {3346, 7958, 6348, 9897};
        int counter = 2;
        int expectedModuloValue = 6;
        int actualModuloValue = getCorrectModuloValue(arr, counter);
        Assert.assertEquals(expectedModuloValue,actualModuloValue);
    }

    @Test
    public void findModuloSuccessTest3()
    {
        int arr[] = {3346, 7958, 6348, 9898};
        int counter = 2;
        int expectedModuloValue = 0;
        int actualModuloValue = getCorrectModuloValue(arr, counter);
        System.out.println(" Modulo is not available for this test : "+expectedModuloValue);
        Assert.assertEquals(expectedModuloValue,actualModuloValue);
    }
}
