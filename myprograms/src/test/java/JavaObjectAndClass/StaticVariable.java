package JavaObjectAndClass;

public class StaticVariable {

	int count=0;
	static int count1=0;
	StaticVariable(){
		count++;
		count1++;
		System.out.println("count value is "+count);
		System.out.println("static count1 value is "+count1);
	}
	
	public static void main(String[] args) {
		StaticVariable s1=new StaticVariable();
		StaticVariable s2=new StaticVariable();
		StaticVariable s3=new StaticVariable();
	}
}
