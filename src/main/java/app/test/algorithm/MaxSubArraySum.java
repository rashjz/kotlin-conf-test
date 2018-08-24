package app.test.algorithm;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[] = {2, -3, 4, -2, 7};

        System.out.println(new MaxSubArraySum().maxSubArray(arr));
    }

    public int maxSubArray(int[] A) {
        int newsum = A[0];
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            newsum = Math.max(newsum + A[i], A[i]);
            max = Math.max(max, newsum);
        }
        return max;
    }


    public void getDublicated() {
        Map<Character, Integer> count = new LinkedHashMap<>();

        String s = "test";

        for (Character character : s.toCharArray()) {
            count.put(character, count.containsKey(character) ? count.get(character) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> c : count.entrySet()) {
            if (c.getValue() > 1) {
                System.out.println(c.getKey());
            }
        }
    }

}
