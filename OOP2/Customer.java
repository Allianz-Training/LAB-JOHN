package OOP2;

public class Customer {
	protected String name;
	protected boolean member=false;
	protected String memberType;
	
	public Customer(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public boolean isMember() {
		return false;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	public String toString() {
		return "";
	}
	

}
