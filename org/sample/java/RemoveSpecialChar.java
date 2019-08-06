package org.sample.java;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String text = "9Welcome@ 123%";
		text = text.replaceAll("[^a-zA-Z ]","");
		text = text.replaceAll("\\d", "");
		text = text.replaceAll(" ", "");
		System.out.println(text);
		System.out.println(text.length());

	}

}
