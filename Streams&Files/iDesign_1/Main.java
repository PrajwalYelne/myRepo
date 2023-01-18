import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {

		// InputStreamReader r = new InputStreamReader(input.csv);
		try{
		BufferedReader br=new BufferedReader(new FileReader("input.csv")) ;
		UserBO ubo = new UserBO();
		List<User> user = ubo.readFromFile(br);
		ubo.display(user);
		}
		catch(Exception e){
			
		}
	}
}

