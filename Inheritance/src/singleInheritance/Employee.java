package singleInheritance;

public class Employee {

	public static void main(String[] args) {
		
		Employer rahul = new Employer(101,125000);
		int bonus = 650000;
		String name = "Rahul Varaghese";
		
		System.out.println("Emplyer details are shows below :");
		
		System.out.println(rahul.toString()+"Bonus is : "+bonus+" Name is :"+name);
		
		
	}
}
