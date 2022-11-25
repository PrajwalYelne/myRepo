public class Department {
	//write your code here
	private Staff staff;
	private String departmentName;
	Department(String a, String b,  String c){
		staff = new Staff(a,b);
		departmentName = c;
	}
	public void display() {
		//write your code here

	}
	public void displayStaff(){
		System.out.println(staff.getStaffName() +" is working in the "+departmentName+" department as "+staff.getDesignation());
	}
}
