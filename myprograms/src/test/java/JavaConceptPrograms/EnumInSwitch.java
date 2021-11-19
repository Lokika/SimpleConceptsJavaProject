package JavaConceptPrograms;

public class EnumInSwitch {
	//switch with enumeration
	public enum Day {sun,mon,tue,wed,thu};
	public static void main(String[] args) {
		Day[] dayvalues = Day.values();
		for(Day var:dayvalues)
			switch(var) {
			case sun : System.out.println("sunday");break;
			case mon : System.out.println("monday");break;
			case wed : System.out.println("wednesday");break;
			default : break;
			}
		
		//wrapper with switch statement
		 Integer age = 18;        
         switch (age)  
         {  
             case (16):            
                 System.out.println("You are under 18.");  
                 break;  
             case (18):                
                 System.out.println("You are eligible for vote.");  
                 break;  
             case (65):                
                 System.out.println("You are senior citizen.");  
                 break;  
             default:  
                 System.out.println("Please give the valid age.");  
                 break;  
         }           
	}
}
