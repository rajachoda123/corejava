package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OccuranceOfCharacter {
    public static void main(String[] args) {
        /* We start by defining a string str that we want to count the characters in.
        We use the chars() method of the string to get an IntStream of the characters in the string.
        We use mapToObj() to convert each integer in the IntStream to a char.
        We use the Collectors.groupingBy() method to group the characters by their value, and count the number of occurrences of each character using Collectors.counting().
        Finally, we print out the count of each character using a forEach() loop that iterates over the entries in the charCount map.*/

        String input = "ilovesaibaba";
        char[] inputChars = input.toCharArray();
        String[] inputStringArray = input.split("");
        Map<String, List<String>> collect = Arrays.stream(inputStringArray)
                .collect(Collectors.groupingBy(s -> s));
        Map<String, Long> resultMap = Arrays.stream(inputStringArray)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(collect);
        System.out.println(resultMap);
    }
}
