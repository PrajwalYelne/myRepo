
public class Account {
	//fill your code here
	protected String accName , accNo , bankName;
	Account(String a,String b, String c){
		accName = a;
		accNo = b;
		bankName = c;
	}
	Account(){}
	public void setAccName(String a){accName = a;
	}
	public String getAccName(){ return accName; 
	}
	public void setAccNo(String a){accNo = a;
	}
	public String getAccNo(){ return accNo; 
	}
	public void setBankName(String a){bankName = a;
	}

	public String getBankName(){ return bankName; 
	}

	protected void display(){
		System.out.println("Account Name:"+accName);
		System.out.println("Account Number:"+accNo);
		System.out.println("Bank Name:"+bankName);
	}
}
