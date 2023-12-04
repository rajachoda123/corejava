package java17;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedCharacterExample {
    public static void main(String[] args) {
        String input = "programming";

        char mostRepeatedChar = findMostRepeatedCharacter(input);

        System.out.println("The most repeated character is: " + mostRepeatedChar);
    }

    private static char findMostRepeatedCharacter(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty or null.");
        }

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the maximum count
        char mostRepeatedChar = '\0'; // Default value if no character is repeated
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostRepeatedChar = entry.getKey();
            }
        }

        return mostRepeatedChar;
    }
}
