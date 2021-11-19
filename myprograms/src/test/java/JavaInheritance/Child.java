package JavaInheritance;

class Parent{
	float salary=100f;
}
public class Child extends Parent{
	int id =5;
	public void display() {
		System.out.println("employee id "+ id );
	}
	public static void main(String[] args) {
		Child c1 =new Child();
		c1.display();
		System.out.println("salary is:"+c1.salary);
	}
}
