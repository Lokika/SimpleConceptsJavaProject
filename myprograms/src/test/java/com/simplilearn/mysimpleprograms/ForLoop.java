package com.simplilearn.mysimpleprograms;

public class ForLoop {
	public static void main(String args[]) {
		
		/*
		 * Pyramid program
		 */
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
		
		/*
		 * Reverse pyramid program
		 */
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
		/*
		 * for each loop
		 */
		int arr[]= {10,23,67,89,90};
		for(int i:arr) {
			System.out.println(i);
		}
		
		/*
		 * Labeled for loop: to break/continue the inner loop
		 */
		
		aa:
			for(int i=1;i<=3;i++) {
				bb:
					for(int j=1;j<=3;j++) {
						if(i==2 && j==2) {
							break aa;
						}
						System.out.println("i:"+i+"j:"+j);
					}
			}
	}
}
