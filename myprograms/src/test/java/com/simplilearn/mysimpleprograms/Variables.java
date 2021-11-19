package com.simplilearn.mysimpleprograms;

public class Variables {

	int a=10;//instance variables
	static double b=9.8; //static variables
	
	public boolean method() { 
		int c=200; //local variables
		System.out.println("local variable:"+c);
		return true;
	}
	public static void main(String args[]) {

		Variables var=new Variables();
		System.out.println(var.method());
		System.out.println("instance variable:"+var.a);
		System.out.println("static variable:"+b);
	}
}
