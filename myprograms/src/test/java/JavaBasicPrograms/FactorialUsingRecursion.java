package JavaBasicPrograms;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static int factorial(int num) {
		if(num==0)
			return 1;
		else
			return (num*factorial(num-1));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		System.out.println(factorial(n));
	}

}
