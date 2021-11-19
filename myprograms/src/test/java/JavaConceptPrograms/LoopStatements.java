package JavaConceptPrograms;

public class LoopStatements {

	public static void main(String[] args) {
		// sum of first 10 natural numbers using for loop
		int res=0;
		for(int i=0;i<=10;i++) {
			res=res+i;
		}
		System.out.println("sum of first 10 natural numbers "+res);

		//for each is used for arrays/collections
		String stringarray[]= {"c","c++","java","python","c#"};
		System.out.println("string array elements are:");
		for(String var:stringarray) {
			System.out.println(var);
		}
		
		//while loop is used if user dono about the number of iterations to be done
		int i=0;
		while(i<=10) {
			System.out.println("value of i is"+i);
			i+=1;
		}
		
		//do while is used to get some lines code before evaluating the condition
		int j=0;
		System.out.println("do while example");
		do {
			System.out.println(j);
			j+=1;
		}while(j<=10);
		
		//break statement with for loop
		int k=0;
		System.out.println("break with for example");
		for(k=0;k<=10;k++) {
			System.out.println(k);
			if(k==6) {
				break;
			}
		}
		
		//break statement with labeled for loop
		System.out.println("break with labelled for loop example");
		a: for(int i1=0;i1<=10;i1++) {
			b:for(int j1=0;j1<=10;j1++) {
				c:for(int k1=0;k1<=10;k1++) {
					System.out.println(k1);
					if(k1==7) {
						break a;
					}
				}
			}
		}
		
		//continue statement with for loop
		System.out.println("continue statement with for loop ");
		for(int x=0;x<=2;x++) {
			for(int y=x;y<=6;y++) {
				if(y==4) {
					continue;
				}
				System.out.println(y);
			}
		}
		
	}
}
