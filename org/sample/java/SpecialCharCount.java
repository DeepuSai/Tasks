package org.sample.java;

public class SpecialCharCount {

	public static void main(String[] args) {
		String name = "9welcome@123%";
		int specialCharCount = 0;
		for (int i = 0; i < name.length(); i++) {
			char v = name.charAt(i);
			if (!Character.isDigit(v) & !Character.isAlphabetic(v) & !Character.isSpace(v)) {
				specialCharCount++;
			}
		}
		System.out.println(specialCharCount);
	}

}
