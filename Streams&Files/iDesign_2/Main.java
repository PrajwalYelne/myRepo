import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) throws Exception {
		//write your code here
		FileWriter wr = new FileWriter("output.csv");
		BufferedWriter bw = new BufferedWriter(wr);
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br  = new BufferedReader(r);
		System.out.println("Enter the number of users:");
		int n = Integer.parseInt(br.readLine());
		ArrayList<User> arr = new ArrayList<>();
		for(int i=1;i<n+1;i++){
			System.out.println("Enter the details of user :"+i);
			String[] data = br.readLine().split(",");
			arr.add(new User(data[0],data[1],data[2],data[3]));
		}
		UserBO.writeFile(arr,bw);
	}
}
 
