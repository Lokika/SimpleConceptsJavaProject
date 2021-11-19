package JavaConceptPrograms;

public class ShiftOperator {

	public static void main(String[] args) {
		// Left shift operator
		System.out.println(10<<2);  //10*2^2 =10*4=40
		
		//Right shift operator
		System.out.println(10>>2);  //10/2^2 =10/4=2
		
		//>> and >>> for positive number
		System.out.println(10>>3);   //10/3^2 =10/9 =1
		System.out.println(10>>>3);//10/3^2 =10/9 =1
		
		//>> and >>> for negative number
		System.out.println(-10>>3);
		System.out.println(-10>>>3);

	}

}
