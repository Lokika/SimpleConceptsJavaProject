package JavaInheritance;

public class SingleInheritance {

	public void display() {
		System.out.println("eating...");
	}
	public static void main(String[] args) {
		dog d1=new dog();
		d1.bark();
		d1.display();
	}

}
class dog extends SingleInheritance{
	public void bark() {
		System.out.println("barking...");
	}
}