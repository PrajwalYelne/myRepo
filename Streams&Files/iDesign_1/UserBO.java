import java.io.*;
import java.util.*;
public class UserBO {
	
	public List<User> readFromFile(BufferedReader br) throws Exception{
        List<User> a = new ArrayList<User>();
		
		String input = br.readLine();
		while(input != null){
			String[] data = input.split(",");
			a.add(new User(data[0],data[1],data[2],data[3]));
			input = br.readLine();
		}
        return a;
	}
	public void display(List<User> list){
		System.out.println("Name            Email                Username        Password");
		for(User x : list)
			System.out.println(String.format("%-15s %-20s %-15s %s",
			x.getName(),x.getEmail(),x.getUsername(),x.getPassword()));
	}
}
