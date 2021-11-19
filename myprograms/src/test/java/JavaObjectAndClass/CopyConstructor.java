package JavaObjectAndClass;

public class CopyConstructor {

	int id;
	String name;
	public CopyConstructor() {}
	CopyConstructor(int i,String n){
		id=i;
		name=n;
	}
	CopyConstructor(CopyConstructor cc){
		id=cc.id;
		name=cc.name;
	}
	
	public void display() {
		System.out.println("details are :"+id+" "+name);
	}
	public static void main(String[] args) {
		
		CopyConstructor c1=new CopyConstructor(11,"ashwini");
		c1.display();
		System.out.println("copying values using constrictor");
		CopyConstructor c2=new CopyConstructor(c1);
		c2.display();
		
		//copying values without using constructor
		CopyConstructor c11=new CopyConstructor(110,"gayathri");
		
		CopyConstructor c111=new CopyConstructor();
		c111.id=c11.id;
		c111.name=c11.name;
		c111.display();
	}
}
