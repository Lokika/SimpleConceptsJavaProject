package JavaConceptPrograms;

public class LogicalOperator {

	public static void main(String[] args) {
		// Logical && and bitwise &
		int a=10;
		int b=20;
		int c=30;
		System.out.println(b<a && c<b); //check second condition too because first condition is false
		System.out.println(a>b & c<b);  //checks both the conditions
		
		
		System.out.println(b>a || c<b);
		System.out.println(a>b | c>b); 
	}

}
