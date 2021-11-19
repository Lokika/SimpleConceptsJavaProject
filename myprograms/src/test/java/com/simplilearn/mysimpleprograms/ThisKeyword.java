package com.simplilearn.mysimpleprograms;

public class ThisKeyword {

	int box;
	String name;
	
	public ThisKeyword() {
		// TODO Auto-generated constructor stub
		this(10,"hyg");
		System.out.println("default constructor");
	}
	public ThisKeyword(int box,String name) {
		// TODO Auto-generated constructor stub
		
		this.box=box;
		this.name=name;
		System.out.println("---"+box+"---"+name);
	}
	
	public void display() {
		System.out.println("---"+box+"---"+name);
	}
	
	public void size() {
		this.display();
		System.out.println("----welcome----");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword t=new ThisKeyword();
		//t.size();
	}

}
