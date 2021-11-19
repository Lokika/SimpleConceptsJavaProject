package JavaBasicPrograms;

public class PrimeNumbersMethod {

	public static void checkPrime(int num) {
		
		if(num==0 || num==1)
			System.out.println(num +" is not prime");
		else {
		int m=num/2;int flag=0;
		//System.out.println(" value of m is:"+m);
		for(int i=2;i<=m;i++) {
			if(num%i==0) {
				flag=1;
				System.out.println(num+" is not prime");
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+" is prime ");
		}
		}
	}
	public static void main(String[] args) {
		checkPrime(0);
		checkPrime(30);
		checkPrime(5);
		checkPrime(10);
		checkPrime(13);
	}
}
