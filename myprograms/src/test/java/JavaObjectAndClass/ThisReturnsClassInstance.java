package JavaObjectAndClass;

public class ThisReturnsClassInstance {

	public ThisReturnsClassInstance get() {
		return this;
	}
	public void display() {
		System.out.println("hello java");
	}
	public void m() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		new ThisReturnsClassInstance().get().display();
		
		//to see if the reference variable and this is displaying same value
		ThisReturnsClassInstance t2=new ThisReturnsClassInstance();
		System.out.println(t2);
		t2.m();
	}
}
