package com.simplelearn.collectionprograms;
public class ArrayListDemo
{
	public static void main(String[] args) 
	{
		Student obj1=new Student();
		obj1.setNames();
		obj1.searchName("sneha");
		obj1.searchName(0);
		obj1.printNames();
		obj1.removeName("ganga");		
	}
}
