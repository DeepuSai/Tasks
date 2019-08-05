package org.sample.java;

public class Fibonacci {

	public static void main(String[] args) {
		int first=0,second=1,third,count=10;
		System.out.print(first + "" +second);
		for(int i=0;i<count;i++) {
			third = first+second;
			System.out.print(third);
			first=second;
			second = third;
		}

	}

}
