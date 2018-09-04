package app.test.arrays;

import java.util.Arrays;

public class StringManipulate {
    
 public static void main(String[] args) {
        String str = "  131  475709  01    ";

        String result = Arrays.stream(str.split(" "))
                .map(StringManipulate::sortStringAlphabetically)
                .reduce((a, b) -> a +" "+ b)
                .orElse("");
        System.out.println(result);
    }
    
    static String sortStringAlphabetically(String str) {
        return str.chars()
                .mapToObj(e -> (char) e)
                .sorted(Character::compareTo)
                .map(String::valueOf)
                .reduce((a, b) -> a + b)
                .orElse("");
    }
}
