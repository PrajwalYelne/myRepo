
public class SavingsAccount extends Account{
	//fill your code here
		private String orgName;
	SavingsAccount(String a,String b,String c,String d){
		super(a,b,c);
		orgName = d;
	}
	SavingsAccount(){
	}
	public void setOrgName(String a){orgName = a;
	}
	public String getOrgName(){ return orgName; 
	}
	@Override
	 public void display(){
		super.display();
		System.out.println("Organisation Name:"+orgName);
	}
}
