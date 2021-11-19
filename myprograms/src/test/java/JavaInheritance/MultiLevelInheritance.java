package JavaInheritance;

public class MultiLevelInheritance {
	void bark(){System.out.println("barking...");} 
	
	public static void main(String[] args) {
		c c1=new c();
		c1.bark();
		c1.eat();
		c1.weep();
	}
}
class B extends MultiLevelInheritance{
	void weep(){System.out.println("weeping...");}  
}
class c extends B{
	void eat(){System.out.println("eating...");}  
}