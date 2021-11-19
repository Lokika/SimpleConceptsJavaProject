package JavaConceptPrograms;

public class AnonymousObject {
	int res=1;
	public void fact(int num) {
		for(int i=1;i<=num;i++) {
			res=res*i;
		}
		System.out.println("Factorial is :"+res);
	}
	public static void main(String[] args) {	
		//using the object at only once . so, created anonymous object which has no reference
		new AnonymousObject().fact(5);
	}
}
