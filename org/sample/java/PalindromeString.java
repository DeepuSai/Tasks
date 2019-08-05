package org.sample.java;

public class PalindromeString {

	public static void main(String[] args) {
		String original = "madam";
		String reverse = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			System.out.println(original.charAt(i));

			reverse = reverse + Character.toString(original.charAt(i));

		}

		if (reverse.equals(original)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("not Palindrome string");
		}

	}
}
