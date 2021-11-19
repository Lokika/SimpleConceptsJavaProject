package com.simplilearn.mysimpleprograms;

public class SwitchCase {

	public enum day {sun,mon,tue,wed,thu,fri,sat}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Usage of wrapper class with switch statement
		 * Integer,Byte,Shot,Long
		 */
		Integer i=90;
		switch(i) {
		
		case (90): System.out.println("90");break;
		default: System.out.println("not eligible");break;
		}
		
		/*
		 * using enum with switch statement
		 */
		day[] de=day.values();
		for(day e:de) {
			switch(e){
			case fri:System.out.println("friday");break;
			case mon:System.out.println("monday");break;
			case wed:System.out.println("wednesday");break;
			default:System.out.println("--nothing--");break;
			}
		}
		
		/*
		 * omitting the break statement
		 */
		int num=10;
		switch(num) {
		case 10: System.out.println("10");
		case 20:System.out.println("20");
		default:System.out.println("no num");
		}
		
		/*
		 * Nested switch case
		 */
		int c=2;
		char d='a';
		switch(c) {
		case 1:System.out.println("case 1");break;
		case 2:switch(d) {
		case 'a':System.out.println("nested switch");break;
		case 'b':System.out.println("--");break;
		default :System.out.println("nothing in inside switch");break;
		}break;
		default:System.out.println("outside switch");
		}
	}
	
	
	
	
}
