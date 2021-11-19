package JavaBasicPrograms;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbr {

	public static void main(String[] args) {
		
		//using random() method
		System.out.println("Random number is:"+Math.random());
		
		//using random class
		Random ram=new Random();Random ram1=new Random();
		System.out.println("Integer random value:"+ram.nextInt(30));
		System.out.println("Float random value:"+ram.nextFloat());
		System.out.println("Double random value:"+ram.nextDouble());
		System.out.println("boolean random value:"+ram.nextBoolean());
		System.out.println("Long random value:"+ram.nextLong());
		
		//using threadlocalrandom class
		System.out.println("Using thread local class:"+ThreadLocalRandom.current().nextInt());
		
		//using ints()and also supported in java 1.8
		//ram1.ints(5, 10,20).forEach(System.out::println);
	}

}
