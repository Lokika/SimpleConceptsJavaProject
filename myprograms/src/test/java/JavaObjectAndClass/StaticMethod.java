package JavaObjectAndClass;

public class StaticMethod {

	int id;
	String name;
	static String college="Nitte";
	
	StaticMethod(int i,String n){
		id=i;
		name=n;
	}
	public static void change(String s) {
		college=s;
	}
	public void display() {
		System.out.println("student details are:"+id+" "+name+" "+college);
	}
	public static void main(String[] args) {
		
		StaticMethod s1=new StaticMethod(10,"manu");
		StaticMethod.change("tagore");
		s1.display();

	}

}
