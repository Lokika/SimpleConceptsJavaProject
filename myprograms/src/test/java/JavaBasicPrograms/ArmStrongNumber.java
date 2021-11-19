package JavaBasicPrograms;

import java.util.Scanner;

public class ArmStrongNumber {

	public static boolean armstrong(int num) {
		int temp,last=0,digits = 0,sum=0;
		temp =num;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		temp=num;
		while(temp>0) {
			last=temp%10;
			sum=(int) (sum+Math.pow(last, digits));
			num=num/10;
		}
		if(num==sum) {
			System.out.println(sum+" is armstrong number");
			return true;
		}	
		else {System.out.println(sum+" is not armstrong number");
			return false;}
	}
	public static void main(String[] args) {
		int num;   
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the number:");
		num=sc.nextInt();  
		armstrong(num);
	}
}
