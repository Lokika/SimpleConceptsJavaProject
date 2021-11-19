package JavaBasicPrograms;

import java.util.Scanner;

public class PalindromeNumberAndString {

	public static void palindromenumber(int num) {
		int temp=num,sum = 0,r;
		while(num>0) {
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(sum==temp) 
			System.out.println(sum +"  is palindrome");
		else
			System.out.println(sum +" is not palindrome");	
	}
	
	public static void palindromestring(String str) {
		int len=str.length()-1;
		String rev="";
		for(int i=len;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
			System.out.println(rev+" palindrome string");
		else
			System.out.println(rev+ " not a palindrome string");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s=sc.next();
		palindromestring(s);
		palindromenumber(151);
		
		//using string methods i.e., StringBuffer class
		StringBuffer str=new StringBuffer("madam");
		System.out.println("reversed string is:"+str.reverse().toString());
		
		//using string methods i.e., StringBuilder class
		StringBuilder s1=new StringBuilder("lol");
		System.out.println("revese is:"+s1.reverse().toString());
	}

}
