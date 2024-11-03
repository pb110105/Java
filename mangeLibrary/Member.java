package mangeLibrary;

interface IMember{
	String getMembershipDetails();
}
class Member implements IMember{
	protected String name;
	protected String memberID;
	
	public Member(String name, String memberID) {
		this.name = name;
		this.memberID = memberID;
	}
	@Override
	public String getMembershipDetails() {
		return "Member: " + name + ", ID: " + memberID;
	}
	

}
