package JavaObjectAndClass;

public class ThisInEventHandling {

	public void m(ThisInEventHandling obj) {
		System.out.println("method invoked");
	}
	public void p() {
		m(this);
	}
	public static void main(String[] args) {
		ThisInEventHandling t1= new ThisInEventHandling();
		t1.p();
	}
}
