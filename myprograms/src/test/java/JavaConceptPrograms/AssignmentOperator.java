package JavaConceptPrograms;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println(a+=2);
		System.out.println(b-=1);
		
		short c=30;
		short d=40;
		System.out.println(c*=2);
		System.out.println(d+=3);
		c=(short) (c+d);
		System.out.println(c);
	}

}
