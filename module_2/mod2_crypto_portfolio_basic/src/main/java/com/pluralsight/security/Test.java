package com.pluralsight.security;
public class Test {
	public static void main(String[] args) {
		System.out.println(addInts(5,4,3,45));
		
		
	}	
	public static int addInts(int i, int ... js) { //ellipses used for n number of local variables
		int sum=0;
		for(int j: js) {
			sum = sum+i;
		}
		return sum;
	}
}
