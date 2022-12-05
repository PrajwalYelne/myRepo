
public class CurrentAccount extends Account{
	//fill your code here
	private String tinNumber;
	CurrentAccount(String a,String b,String c,String d){
		super(a,b,c);
		tinNumber = d;
	}
	CurrentAccount(){}
	public void setTinNumber(String a){tinNumber = a;
	}
	public String getTinNumber(){ return tinNumber;
	 }
	@Override
	public void display(){
		super.display();
		System.out.println("TIN Number:"+tinNumber);
	}
}
