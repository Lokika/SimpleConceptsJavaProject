package com.simplilearn.mysimpleprograms;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * pre and post increment unary operators 
		 */
		int x=10;
		int y= ++x; int z= x++;
		System.out.println("prefix operator:"+y);
		System.out.println("suffix operator:"+z);
		System.out.println("\n");
		
		int sum=y+z;
		System.out.println("sum:"+sum);
		System.out.println("\n");
		/*
		 * pre and post decrement unary operators
		 */
		int a=15;
		int b=--a; int c=a--;
		System.out.println("prefix operator:"+b);
		System.out.println("suffix operator:"+c);
		System.out.println("\n");
		
		int diff=c-b;
		System.out.println("diff:"+diff);
		
		
		/*
		 * ! and ~ operators
		 */
		int r=10;boolean s=true;
		int h=-9; boolean t=false;
		System.out.println(~r);
		System.out.println(~h);
		System.out.println(!s);
		System.out.println(!t);
	}

}
