package com.simplilearn.mysimpleprograms;
public class IfElseLoop {

	public static void main(String args[]) {
		
		/*
		 * even or odd number program
		 */
		int num=6;
		if(num%2==0) {
			System.out.println("num is even");
		}else {
			System.out.println("num is odd");
		}
		
		/*
		 * leap year program
		 */
		int year=1900;
		if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)) {
			System.out.println("leap year");
		}else {
			System.out.println("not leap year");
		}
	}
}
