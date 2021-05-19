package com.qa.gitpush;

import java.util.ArrayList;

public class array {
	
	public static void main(String[] args) {
		
		int[] myIntArr;
		
		myIntArr = new int[3];
		
		myIntArr[0] = 72;
		myIntArr[1] = 49;
		myIntArr[2] = 98;
		
		int[] myOtherIntArr = {3,8,7};
		
		int someNum = myOtherIntArr[2];
		System.out.println(someNum);
	}
}

//space 

int[] primArray = new int[5];

 ArrayList<Integer> array = new ArrayList<>(); 

 array.add(5);
 array.add(5);
 array.add(5);
 array.add(5);
 array.add(5);
 
 for(int x = 0; x < array.size(); x++) {
	 System.out.println(array.get(x));
 }
 
 for(Integer handle : array) {
	 System.out.println(handle);
 }
 
 System.out.println( "Size of the array: " + array.size() );
}