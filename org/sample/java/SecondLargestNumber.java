package org.sample.java;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int arr[]= {10,20,30,0,50};
		int firstlargestnumber = 0;
		int secondlargestnumber = 0;
		for(int i = 0;i<arr.length;i++) {
			if(firstlargestnumber<arr[i]) {
				//0<10
				secondlargestnumber=firstlargestnumber;
				firstlargestnumber=arr[i];
			}else if(secondlargestnumber<arr[i]){
				secondlargestnumber=arr[i];
			}
		}
System.out.println("SecondLargest:"+secondlargestnumber);
	}

}
