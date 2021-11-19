package JavaConceptPrograms;

public class AccountClass {

	public static void main(String[] args) {
		TestClass acc =new TestClass();
		acc.insert(10,"lokika", 1000);
		acc.deposit(500);
		acc.withdraw(10);
		acc.checkbalance();
		acc.display();
	}
}
class TestClass{
	int id;
	String name;
	float amount;
	
	public void insert(int i,String str,float f) {
		id=i;
		name=str;
		amount=f;
	}
	public void deposit(float amt) {
		amount =amount+amt;
		System.out.println("deposit amount is:"+amount);
	}
	public void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("insufficient balance");
		}else {
			amount =amount -amt;
			System.out.println("withdrawn amount is:"+amount);
		}
	}
	public void checkbalance() {
		System.out.println("balance amount is:"+amount);
	}
	
	public void display() {
		System.out.println("account id "+id+" "+" account name "+name+" balance amount "+amount);
	}
}