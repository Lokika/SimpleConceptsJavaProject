package com.simplilearn.mysimpleprograms;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Addition of two numbers
		 */
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition result is:"+c);
		System.out.println("\n");
		
		/*
		 * variables widening
		 * showing integer value in float
		 */
		int d=14;
		float e=d;
		System.out.println("integer is:"+d);
		System.out.println("float is:"+e);
		System.out.println("\n");
		/*
		 * variable narrowing-->typecasting
		 * showing float in integer 
		 */
		float f=3.5f;
		int g=(int) f;
		System.out.println("float is:"+f);
		System.out.println("integer is:"+g);
		System.out.println("\n");
		/*
		 * overflow
		 * variable bytes value
		 */
		int h=140;
		byte i= (byte) h;
		System.out.println("integer is:"+h);
		System.out.println("byte is:"+i);
		System.out.println("\n");
		
		/*
		 * Adding lower data type i.e., byte data types
		 */
		byte j=90;
		byte k=10;
		byte result= (byte) (j+k);
		System.out.println(result);
		System.out.println("\n");
	}

}
