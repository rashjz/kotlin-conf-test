package app.test.arrays;


public class StringManipulate {

    static String sortStringAlphabetically(String str) {
        return str.chars()
                .mapToObj(e -> (char) e)
                .sorted(Character::compareTo)
                .map(String::valueOf)
                .reduce((a, b) -> a + b)
                .orElse("");
    }
}
