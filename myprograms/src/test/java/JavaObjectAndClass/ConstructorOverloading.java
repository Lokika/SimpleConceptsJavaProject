package JavaObjectAndClass;

public class ConstructorOverloading {

	int id;
	String name;
	int age;
	//default constructor
	ConstructorOverloading(){}
	
	//parameterized constructor
	ConstructorOverloading(int i,String s){
		id=i;
		name=s;
	}
	ConstructorOverloading(int i,String s,int a){
		id=i;
		name=s;
		age=a;
	}
	public void display() {
		System.out.println("student details are :"+id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		ConstructorOverloading c=new ConstructorOverloading(10,"loki");
		c.display();
		ConstructorOverloading c1=new ConstructorOverloading(10,"loki",26);
		c1.display();
		ConstructorOverloading c2=new ConstructorOverloading();
		c2.display();
	}

}
