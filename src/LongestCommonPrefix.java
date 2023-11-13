public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Assume the first string as the initial common prefix
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Iterate through characters of the current string and compare with the prefix
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            // Update the prefix to the common part
            prefix = prefix.substring(0, j);

            // If the prefix becomes empty, no common prefix exists
            if (prefix.isEmpty()) {
                break;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "raja"};
        String result = longestCommonPrefix(strings);
        System.out.println("Longest Common Prefix: " + result);
    }
}
