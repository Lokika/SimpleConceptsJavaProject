package JavaConceptPrograms;

public class LeapYear {

	public static void main(String[] args) {
		// Leap Year 
		int year=2020;
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println("leap year");
		}else {
			System.out.println("not leap year");
		}
		
		//even or odd number using if else
		int num=8;
		if(num%2==0) {
			System.out.println("***even number***");
		}else {
			System.out.println("***odd number***");
		}
		
		//even or odd using ternary operator
		int var=1;
		String res = (var%2==0)?"even number":"odd number";
		System.out.println(res);
		
		//To check if number is positive,negative or zero
		int x=-7;
		if(x>0) {
			System.out.println("positive number");
		}else if(x<0) {
			System.out.println("negative number");
		}else if(x==0) {
			System.out.println("its zero ");
		}else {
			System.out.println("its not a number");
		}
		
	}

}
