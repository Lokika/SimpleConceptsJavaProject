package JavaConceptPrograms;

public class IfStatement {

	public static void main(String[] args) {
		// Simple if statement
		int x=10;
		int y=20;
		if(x+y >20) {
			System.out.println("adding x+y is greater than its result");
		}

		//if else statement
		int x1=10;
		int y1=20;
		if(x1+y1 <20) {
			System.out.println("adding x1+y1 is lesser than its result");
		}else {
			System.out.println("adding x1+y1 is greater than its result");
		}

		//if-else-if statement
		int x2=10;
		int y2=20;
		if(x2+y2 <20) {
			System.out.println("adding x2+y2 is lesser than its result");
		}else if(x2+y2 >20){
			System.out.println("adding x2+y2 is greater than its result");
		}else if(x2+y2 ==30) {
			System.out.println("adding x2+y2 is equal to its result");
		}else {
			System.out.println("-----");
		}

		//nested if statement
		String address = "Delhi, India";    

		if(address.endsWith("India")) {    
			if(address.contains("Meerut")) {    
				System.out.println("Your city is Meerut");    
			}else if(address.contains("Noida")) {    
				System.out.println("Your city is Noida");    
			}else {    
				System.out.println(address.split(",")[0]);    
			}    
		}else {    
			System.out.println("You are not living in India");    
		}  
		
		//switch statement
		int num = 0;  
		switch (num){  
		case 0:  
		System.out.println("number is 0");  
		break;
		case 1:  
		System.out.println("number is 1");  
		break;  
		default:  
		System.out.println(num);  
		}  
	}

}
