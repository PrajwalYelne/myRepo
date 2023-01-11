import java.io.*;
import java.util.*;
public class UserBO {

	public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception {
		//write your code here
		for(User x : userList){
			String data  = x.getName() +","+ x.getMobileNumber() +","+x.getUsername() +"," +x.getPassword();
			bw.write(data,0,data.length());
			bw.newLine();
		}
		bw.flush();
	}
}
