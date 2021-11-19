package JavaObjectAndClass;

public class ThisKeyword {

	int id;
	String name;
	float marks;
	ThisKeyword(){
		System.out.println("this is default constructor");	
	}
	
	//used to refer current class instance variables
	ThisKeyword(int id,String name,float marks){
		this();
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public void display() {
		System.out.println("student details are "+id+" "+" "+name+" "+marks);
	}
	
	//used to invoke current class method
	public void m() {
		System.out.println("its m");
	}
	public void n() {
		m();  //compiler reads its as this.m();
		System.out.println("its n");
	}
		
	public static void main(String[] args) {
		ThisKeyword t1=new ThisKeyword(1,"manasa",500);
		t1.display();
		t1.n();
	}

}
