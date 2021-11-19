package JavaInheritance;

public class HierarchicalInheritance {
	void bark(){System.out.println("barking...");} 
	
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.bark();
		c1.eat();
		//c1.weep(); throws compilation error
	}
}
class B11 extends HierarchicalInheritance{
	void weep(){System.out.println("weeping...");}  
}
class C1 extends HierarchicalInheritance{
	void eat(){System.out.println("eating...");}  
}