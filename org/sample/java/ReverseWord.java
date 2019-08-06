package org.sample.java;

public class ReverseWord {

	public static void main(String[] args) {
		String name = "Greens Technologies";
		String a[] = name.split("");
		// a[0] = "Greens"
		// a[1] = "Technologies"
		// a.length will be 2
		for (int i = 0; i < a.length; i++) {
			String q = a[i];
			for (int j = q.length() - 1; j >= 0; j--) {
				char rev = q.charAt(j);
				System.out.print(rev);
			}

		}
		//System.out.print("");
	}

}
