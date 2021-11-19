package JavaConceptPrograms;

public class NestedForLoop {

	public static void main(String[] args) {
		// To demonstrate pyramid example using nested for loop
		System.out.println("To demonstrate pyramid example using nested for loop");
		int r=5;int c=5;
		for(r=1;r<=5;r++) {
			for(c=1;c<=r;c++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
		
		//to demonstrate reverse of pyramid with nested if loop
		System.out.println("to demonstrate reverse of pyramid with nested if loop");
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}

	}

}
