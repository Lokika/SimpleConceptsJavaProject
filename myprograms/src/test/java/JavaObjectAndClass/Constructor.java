package JavaObjectAndClass;

public class Constructor {

	int id;
	String name;
	Constructor(){
		System.out.println("I am default constructor");
	}
	public static void main(String[] args) {
		Constructor c =new Constructor();
		System.out.println(c);

	}

}
