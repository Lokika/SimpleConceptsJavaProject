package JavaBasicPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int m=n/2;
		System.out.println("m value is:"+m);
		int flag = 0;
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.println(n+" is prime");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(n+" is not prime");
		}
	}

}
