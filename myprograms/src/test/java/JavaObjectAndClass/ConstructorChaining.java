package JavaObjectAndClass;

public class ConstructorChaining {

	int id;
	String name;
	float marks;
	double fees;
	ConstructorChaining(int id,String name,float marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	ConstructorChaining(int id,String name,float marks,double fees){
		this(id,name,marks); //reusing the constructor
		this.fees=fees;
	}
	public void display() {
		System.out.println("details are:"+id+" "+name+" "+marks+" "+fees);
	}
	public static void main(String[] args) {
		ConstructorChaining c2=new ConstructorChaining(12,"dedds",1234);
		ConstructorChaining c1=new ConstructorChaining(2,"des",123,3450);
		c2.display();
		c1.display();
		
	}

}
