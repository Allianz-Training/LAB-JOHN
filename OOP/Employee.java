package OOP;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	public String position;
	public static int day=15;
	

	public Employee(String firstnameInput, String lastnameInput, int salaryInput, String po) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		salary = salaryInput;
		position = po;

	}
	public static void addDay() {
		day =day+1;
		System.out.println(day);
		
	}

	public void hello() {
		System.out.println("Hello " + firstname);
	}

	public int getSalary() {
		return salary;
	}

	public void checkPosition() {
		System.out.println("My position is " + position);
	}

	public String getFull() {
		return firstname.concat(" " + lastname);
	}

	public static void main(String[] args) {
		Employee e = new Employee("John", "DOE", 1000000, "CEO");
		Employee e1 = new Employee("Fu", "Inw", 30000, "BACKEND");

		e.checkPosition();
		e1.checkPosition();
		System.out.println(e1.getSalary());

		System.out.println(e1.getFull());
		Employee[] em = new Employee[3];

		for (int i = 0; i < em.length; i++) {
			em[i] = new Employee("First Name " + i, "last name " + i, 1000 * i, "position " + i);
		}
		System.out.println(em[2].firstname);
		System.out.println(em[2].position);
		e.addDay();

	}

}
