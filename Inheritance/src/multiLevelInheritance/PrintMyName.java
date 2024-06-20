package multiLevelInheritance;

public class PrintMyName {

	public static void main(String[] args) {
		
		Three n = new Three();
		
		// Below method will print this 
		n.print_this();
		
		// Below method will print is 
		n.print_Is();
		
		//Below method will print Raghvendra
		n.print_Raghav();
	
		//One obj = new Three();
		// obj.print_Is(); not possible because this method is in class Two
	
	}
}
