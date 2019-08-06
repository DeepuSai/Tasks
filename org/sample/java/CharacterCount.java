package org.sample.java;

public class CharacterCount {

	public static void main(String[] args) {
		String str ="9Welcome@123%";
		int temp=0;
		for(int i=0;i<str.length();i++) {
			char text = str.charAt(i);
			if(Character.isAlphabetic(text)) {
				temp++;
			}
		}
			System.out.println(temp);
		

	}

}
