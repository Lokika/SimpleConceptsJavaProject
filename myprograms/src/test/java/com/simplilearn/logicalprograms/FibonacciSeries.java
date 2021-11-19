package com.simplilearn.logicalprograms;

public class FibonacciSeries {
	
	/*
	 * Fibonacci series: 0,1,1,2,3,5,8,13,21....
	 */
	public void fibonacci(int term) {
		int first=0;
		int second=1;
		int res=0;
		System.out.println(first);
		System.out.println(second);
		for(int k=0;k<term;k++) {
			res=first+second;
			System.out.println(res);
			first=second;
			second=res;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		FibonacciSeries fib=new FibonacciSeries();
		fib.fibonacci(10);	
				
	}

}
