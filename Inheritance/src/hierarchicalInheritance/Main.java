package hierarchicalInheritance;

public class Main {

	public static void main(String[] args) {
		
		B obj_b = new B();
		obj_b.print_A();
		obj_b.print_B();
		
		// when do you want to implement hierarchical Inheritance
		
		C obj_c = new C();
		obj_c.print_A();
		obj_c.print_C();
		
		D obj_d = new D();
		obj_d.print_A();
		obj_d.print_D();
		
		
	}
}
