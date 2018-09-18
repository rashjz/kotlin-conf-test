package rashjz.info.intro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    Find Missing Number in array or else return 1
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, -1};
//        int[] arr = {-1, -4, -2, -5, -1};

        findFirstMissingVal(arr);
    }

    private static int findFirstMissingVal(int[] arr) {
        List<Integer> set = Arrays.stream(arr)
                .sorted()
                .filter(x -> x > 0)
                .distinct()
                .boxed()
                .collect(Collectors.toList());

        int max = set.stream().max(Integer::compareTo).orElse(1);

        int val = IntStream.range(1, max)
                .filter(a -> !set.contains(a))
                .findFirst()
                .orElse(1);

        System.out.println(val);
        return val;
    }
}
