import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by makerofapps on 11/28/17.
 */

public class MainTest {
    @Test
    public void replaceCharacters() throws Exception {
        Main main = new Main();
        String  expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";
        String actual = main.replaceCharacters("The Farmer went to the store to get 1 dollar’s worth of fertilizer");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void average() throws Exception {
        Main main = new Main();
        double[] numbers = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
        double expected = 5.0;
        double actual =  main.average(numbers);
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void swap() throws Exception {
        Main main = new Main();
        String[] arr = {"A1","B2","C3"};
        String[] expected = {"C3", "B2", "A1"};
        String[] actual = main.swap(arr);
        assertArrayEquals(expected, actual);
    }

//    @Test
//    public void printLargest() throws Exception {
//        Main main = new Main();
//        int[] numArr = {100, 10,20,30, 1, 200, 11};
//        int expected = numArr[5];
//        int actual = main.printLargest(numArr);
//        Assert.assertEquals(expected, actual);
//
//    }

//    @Test
//    public void printLowest() throws Exception {
//        Main main = new Main();
//        int[] numArr = {100, 10,20,30, 1, 200, 11};
//        int expected = numArr[4];
//        int actual = main.printLowest(numArr);
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void countAllWordsInAString() throws Exception {
       // Main main = new Main();

    }

}

