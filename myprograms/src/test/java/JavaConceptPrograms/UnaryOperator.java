package JavaConceptPrograms;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		//post increment and decrement
		System.out.println(a++);
		System.out.println(a--);
		System.out.println("\n");
		
		//pre increment and decrement
		System.out.println(++b);
		System.out.println(--b);
		System.out.println("\n");
		
		//it just prints the variable value 
		System.out.println(+a);
		System.out.println(-b);
		System.out.println("\n");
		
		int c=10;
		int d=10;
		System.out.println(c++ + ++c);
		System.out.println(d++ + d++);
		System.out.println("\n");
		
		int e=10;
		int f=-10;
		System.out.println(~e);
		System.out.println(~f);
		System.out.println("\n");
		
		boolean g=true;
		boolean h=false;
		System.out.println(!g);
		System.out.println(!h);
		
	}

}
