package OOP;

public class EmployeeSpecial extends Employee {
	public String specialSkill;
	

	public EmployeeSpecial(String firstnameInput, String lastnameInput, int salaryInput, String po) {
		super(firstnameInput, lastnameInput, salaryInput, po);
		// TODO Auto-generated constructor stub
	}

	public EmployeeSpecial(String firstnameInput, String lastnameInput, int salaryInput, String po,String skill) {
		this(firstnameInput, lastnameInput, salaryInput, po);
		specialSkill=skill;

		
	}
	
	@Override
	public String toString() {
		return "First name "+firstname+" last name "+lastname+" Saraly "+getSalary()+" position "+position+" Skill "+specialSkill;
	}

	public static void main(String[] args) {
		EmployeeSpecial e = new EmployeeSpecial("JOHN", "DOE", 100000, "CEO", "SLEEP");
		System.out.println(e);
		// TODO Auto-generated method stub

	}

}
