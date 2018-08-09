package app.test.arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;


/**
 * Created by Rashad on 8/6/2018.
 */
@RunWith(JUnit4.class)
public class MovingZeroValuesTest {
    private MovingZeroValues movingZeroValues = new MovingZeroValues();

    @Test
    public void testEvaluateWithGivenArrayMustReturnSorted() {
        int[] actual = {4, 3, 0, 1, 0, 0, 7, 8, 0};
        int[] expected = {0, 0, 0, 0, 4, 3, 1, 7, 8};
        assertArrayEquals(expected, movingZeroValues.evaluate(actual));
    }

    @Test
    public void testEvaluateWithNonZeroArrayMustReturnSorted() {
        int[] actual = {4, 3, 1, 1, 2, 3, 7, 8, 9};
        assertArrayEquals(actual, movingZeroValues.evaluate(actual));
    }

    @Test
    public void testEvaluateWithOnlyZeroValuesMustReturnSameArray() {
        int[] actual = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(actual, movingZeroValues.evaluate(actual));
    }

} 
