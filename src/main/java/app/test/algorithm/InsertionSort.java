package app.test.algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {32, 23, 45, 87, 92, 31, 19};
        new InsertionSort().sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {32, 23, 0, 87, 0, 31, 19};
//        System.out.println(Arrays.toString(moveZeroes(arr2)));
    }

    private void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;
            while (j > 0 && current < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current;
        }

    }


}
