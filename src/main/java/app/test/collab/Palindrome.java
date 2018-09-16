package app.test.collab;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Rashad on 9/12/2018.
 */
public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindromeCandidate("abba"));
        System.out.println(isPalindromeString("abba"));
    }

    private static Boolean isPalindromeCandidate(String text) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        text.chars().mapToObj(c -> (char) c)
                .forEach(c -> hashMap.put(c, hashMap.get(c) != null ? hashMap.get(c) + 1 : 1));

        hashMap.forEach((character, integer) -> System.err.println(character + " " + integer));
        return hashMap.values().stream().filter(e -> e == 1).count() > 1;
    }


    private static void uniqueElementFromArray() {
        Integer[] numbers = new Integer[]{1, 2, 1, 3, 4, 4};
        Set<Integer> allItems = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers)
                .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
                .collect(Collectors.toSet());
        System.out.println(duplicates); // [1, 4]

    }

    private static boolean isPalindromeString(String s) {
        return IntStream.range(0, s.length() / 2)
                .noneMatch(i -> s.charAt(i) != s.charAt(s.length() - i - 1));
    }
} 
