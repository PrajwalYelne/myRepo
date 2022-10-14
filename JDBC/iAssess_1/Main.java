import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;

public class Main{
    
    public static void main(String [] args) throws Exception{
        //fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Before the Delete");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n","Id","Name","Email","Password","Age","Role","CreatedDate","Status");
        UserDAO udao = new UserDAO();
		List<User> userList = udao.listUsers();
		for(User x : userList) System.out.println(x);
		
        System.out.println("Enter the Id :");
        udao.deleteUser(sc.nextInt());
        System.out.println("After the Delete");
		System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %s\n","Id","Name","Email","Password","Age","Role","CreatedDate","Status");
        
		userList = udao.listUsers();
        for(User x : userList) System.out.println(x);
    }

}
