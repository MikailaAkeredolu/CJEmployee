import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by makerofapps on 11/17/17.
 */
public class MainTest {
    @Test
    public void getLastIndex() throws Exception {
        Main main = new Main();
        String[] names = {"ba", "ba", "c", "d", "eee", "f", "ll"};
        int expected = names.length - 1;
        int actual = main.getLastIndex(names);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getSecondToLastIndex() throws Exception {
        Main main = new Main();
        String[] names = {"ba", "ba", "c", "d", "eee", "f", "ll"};
        int expected = names.length - 2;
        int actual = main.getSecondToLastIndex(names);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFirstElement() throws Exception {
        Main main = new Main();
        String[] names = {"ba", "ba", "c", "d", "eee", "f", "ll"};
        String expected = names[0];
        String actual = main.getFirstElement(names);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLastElement() throws Exception {
        String[] names = {"ba", "ba", "c", "d", "eee", "f", "ll"};
        Main main = new Main();
        String expected = "ll";
        String actual = main.getLastElement(names);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSecondToLastElement() throws Exception {
        String[] names = {"a", "b", "c", "d", "e", "f", "g"};
        Main main = new Main();
        String expected = "f";
        String actual = main.getSecondToLastElement(names);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getSum() throws Exception {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Main main = new Main();
        int expected = 55;
        int actual = main.getSum(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverage() throws Exception {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Main main = new Main();
        int expected = 5;
        int actual = main.getAverage(numbers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void contains() throws Exception {
        String[] names = {"ba", "ba", "c", "d", "eee", "f", "ll"};
        Main main = new Main();
        boolean expected = true;
        boolean actual = main.contains(names, "eee");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIndexByElement() throws Exception {
        String[] names = {"ba", "ba", "c", "d", "eee", "f", "ll"};
        Main main = new Main();
        int expected = 0;
        int actual = main.getIndexByElement(names, "ba");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void printOddNumbersFrom19To3() throws Exception {

    }

    @Test
    public void printGivenStringTimesNumberGiven() throws Exception {
    }

    @Test
    public void repeatFirstThreeLetters() throws Exception {
    }

    @Test
    public void testName() {
        Main main = new Main();
        int start = 10;
        int end = 3;
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        main.printOddNumbersInRange(start, end);
        assertEquals("9 7 5 3 ", os.toString());
    }

}