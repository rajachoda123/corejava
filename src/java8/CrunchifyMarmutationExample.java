package java8;

/**
 * @author Crunchify.com
 * 
 */

public class CrunchifyMarmutationExample {

	public static void main(String[] args) {
		String s = "AB";
		String s1 = "EBAY";
		String s2 = "Yahoo";
		permutation(s);
		// System.out.println("\nString " + s1 + ":\nPermutations: " +
		 //crunchifyPermutation(s1);
		// System.out.println("\nString " + s2 + ":\nPermutations: " +
		// crunchifyPermutation(s2));
	}

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}
}