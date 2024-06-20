package singleInheritance;

public class Employer {
	
	private int id;
	private float salary;
	
	Employer()
	{
		
	}
	
	Employer(int id, float sal)
	{
		this.id = id; // what's  the difference in assigning the value of these two constructor
		
		salary = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employer [id=" + id + ", salary=" + salary + "]";
	}
	
}
