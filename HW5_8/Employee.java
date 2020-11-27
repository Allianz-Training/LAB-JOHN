package HW5_8;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;

	}

	public int getSalary() {
		return salary;
	}
	

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return firstName.concat(" "+lastName);
		
	}
	public int getAnnualSalary() {
		return salary*12;
	}
	public int raiseSalary(int percent) {
//		
		return salary = salary+((percent/100)*salary);
	}
	public String toString() {
		return "Employee[id= "+id+" ,Name= "+getName()+" ,Salary= "+salary+"]" ;
	}

	public static void main(String[] args) {
		Employee em = new Employee(42257, "Kajonsak", "Skolvaree", 100);
		System.out.println(em.toString());
		em.raiseSalary(20);
		
		System.out.println(em.toString());
		System.out.println(em.salary);
		System.out.println(em.getAnnualSalary());
		System.out.println(em.raiseSalary(10));


		
		// TODO Auto-generated method stub

	}

}
