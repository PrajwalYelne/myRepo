import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users:");
		int n = sc.nextInt();
		ArrayList<User> list = new ArrayList<>();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of user " + (i+1));
			String s = sc.nextLine();
			String a[] = s.split(",");
			User user = new User(a[0] , a[1] , a[2] , a[3]);
			list.add(user);
			a=null;
		}
		
		System.out.println("Enter the number of cities:");
		int n1 = sc.nextInt();
		CityCount citycount[] = new CityCount[n1];
		List<String> list1 = new ArrayList<>(); 
		for(int i=1;i<=n1;i++)
		{
			System.out.println("Enter the name of city " + i);
			String s = sc.next();
			list1.add(s);
			
		}
		
		for(int i=0;i<n1;i++) {
			String s = list1.get(i);
			citycount[i] = new CityCount(s , list);
			citycount[i].start();
			citycount[i].join();			
			System.out.println(s + "--" + citycount[i].getCount());
		}
		
		
	}

}
