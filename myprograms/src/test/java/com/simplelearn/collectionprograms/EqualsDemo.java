package com.simplelearn.collectionprograms;

import java.util.Scanner;

public class EqualsDemo
{
	public static void main(String[] args) 
	{
		Studentt obj1=new Studentt(10,"acd");
		Studentt obj2=new Studentt(10,"acd");
		if(obj1.equals(obj2))
			System.out.println("parameterzied contents are equal");
		else
			System.out.println("parameterzied contents are not equal"+"\n");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the rollno and name of 1st object from keyboard:"); 
		int num1=sc.nextInt();
		String name1=sc.next();
		obj1.setRollNo(num1);
		obj1.setName(name1);
		System.out.println("please enter the rollno and name of 2nd object from keyboard:"); 
		int num2=sc.nextInt();
		String name2=sc.next();
		obj2.setRollNo(num2);
		obj2.setName(name2);
		if(Integer.compare(num1, num2)==0 && name1.equals(name2))
			System.out.println("user entered rollno and names are equal");
		else
			System.out.println("user entered rollno and names are not equal");
		
		
	}
}
