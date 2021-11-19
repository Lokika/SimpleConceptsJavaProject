package JavaObjectAndClass;

public class ThisInConstructorCall {

	int data=10;
	ThisInConstructorCall(){
		B b1=new B(this);
		b1.display();
	}
	public static void main(String[] args) {
		ThisInConstructorCall t1=new ThisInConstructorCall();
	}

}
class B{
	ThisInConstructorCall obj;
	B(ThisInConstructorCall obj){
		this.obj=obj;
	}
	public void display() {
		System.out.println(obj.data);
	}
}