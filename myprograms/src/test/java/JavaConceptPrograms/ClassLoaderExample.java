package JavaConceptPrograms;

public class ClassLoaderExample {

	public static void main(String[] args) {
		//This is printing the current class loader name i.e., system/application class loader
		Class c=ClassLoaderExample.class;
		System.out.println(c.getClassLoader());
		System.out.println("Current class loader name is : "+ClassLoaderExample.class.getClassLoader());
		
		//this is printing the class loader name of the String which in turn loads bootstrap class loader since String belongs to rt.jar
		System.out.println("String class name is : "+String.class.getClassLoader());
	}
}
