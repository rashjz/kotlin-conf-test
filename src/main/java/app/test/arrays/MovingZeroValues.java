package app.test.arrays;


/**
 * Created by Rashad on 8/6/2018.
 */

public class MovingZeroValues {


    int[] evaluate(int[] arrays) {
        int[] sortedArrays = new int[arrays.length];

        int countZeroes = 0;
        for (int array : arrays) {
            if (array == 0) {
                countZeroes++;
            }
        }

        for (int array : arrays) {
            if (array != 0) {
                countZeroes++;
                sortedArrays[countZeroes - 1] = array;
            }
        }
        return sortedArrays;
    }

} 
