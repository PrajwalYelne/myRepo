import java.util.*;
public class Main {
	public static void main(String args[]) {
		//write your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the staff:");
		String name = sc.nextLine();
		System.out.println("Enter the staff designation:");
		String designation = sc.nextLine();
		System.out.println("Enter the department name:");
		String department = sc.nextLine();
		Department x = new Department(name,designation,department);
		x.displayStaff();
		}
}
