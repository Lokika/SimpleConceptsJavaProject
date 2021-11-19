package JavaObjectAndClass;

public class ObjectAndClass {

	int id;
	String name;
	public void method(int i,String str) {
		id=i;
		name=str;
	}
	public void display() {
		System.out.println("the id is :"+id+" name is :"+name);
	}
	public static void main(String[] args) {
		
		ObjectAndClass obj1= new ObjectAndClass();
		obj1.method(10, "lokika");
		obj1.display();
	}

}
