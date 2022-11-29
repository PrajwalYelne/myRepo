import java.util.*;
import java.io.*;
public class Main {
		public static void main(String[] args) throws IOException{
		//fill your code here
		 InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader sc =new BufferedReader(r); //  Scanner sc = new Scanner(System.in);
		System.out.println("Choose Account Type\n1.Savings Account\n2.Current Account");
		int n = Integer.parseInt(sc.readLine());
		String z = new String();
		if(n == 1){
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
		    z  = sc.readLine();
		    String[] tokens= z.split(",");
			SavingsAccount sa = new SavingsAccount(tokens[0],tokens[1],tokens[2],tokens[3]);
			sa.display();
            // System.out.println(z);
		}
		else if(n == 2){
	
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
		    z = sc.readLine();
		    String[] token= z.split(",");
			CurrentAccount ca = new CurrentAccount(token[0],token[1],token[2],token[3]);
			ca.display();
            // System.out.println(z);
		}
	}
}
