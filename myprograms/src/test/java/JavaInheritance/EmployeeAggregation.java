package JavaInheritance;

public class EmployeeAggregation {

	int empid;
	String empname;
	Address address;
	
	EmployeeAggregation(int empid,String empname,Address address){
		this.empid=empid;
		this.empname=empname;
		this.address=address;
	}
	public void display() {
		System.out.println("employee details are :"+empid + " "+ empname);
		System.out.println("address details are:"+address.city +" "+address.state+" "+address.country);
	}
	
	public static void main(String[] args) {
		Address a1=new Address("bangalore", "Karnataka", "India");
		EmployeeAggregation e1=new EmployeeAggregation(10, "lokika", a1);
		e1.display();
	}
}
