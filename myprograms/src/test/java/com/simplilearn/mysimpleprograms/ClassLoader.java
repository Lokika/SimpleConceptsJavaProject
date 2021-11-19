package com.simplilearn.mysimpleprograms;

public class ClassLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Bootstrap loaders-->java.lang,java.io,java.util,java.math,java.sql
		 * Extension loaders
		 * Application loaders
		 */
		Class c=ClassLoader.class;
		System.out.println("-----"+c.getClassLoader()+"-----");
		System.out.println(String.class.getClassLoader());
	}

}
