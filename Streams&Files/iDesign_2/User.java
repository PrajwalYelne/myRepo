public class User {
	
	private String name ,mobileNumber,username,password;
	User(String name, String mobileNumber, String username, String password){
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password; 
	}
	void setName(String name){
		this.name = name;
	}
	void setPassword(String password){
		this.password = password;
	}
	void setMobileNumber(String mobileNumber){
		this.mobileNumber= mobileNumber;
	}
	void setUsername(String username){
		this.username = username;
	}
	String getName(){
		return name;
	}
	String getPassword(){
		return password;
	}
	String getMobileNumber(){
		return mobileNumber;
	}
	String getUsername(){
		return username;
	}
}
