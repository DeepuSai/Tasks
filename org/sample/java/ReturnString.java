package org.sample.java;

public class ReturnString {
static String str;
	public  String display() {
		String str = "hello";
		return str;
	}
	public static void main(String[] args) {
		ReturnString obj = new ReturnString();
		String returnvalue = obj.display();
		System.out.println(returnvalue);

	}

}
