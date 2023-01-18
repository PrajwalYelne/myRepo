public class User{
	
	private String name ,email,username,password;
	User(String name, String email, String username, String password){
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password; 
	}
	void setName(String name){
		this.name = name;
	}
	void setPassword(String password){
		this.password = password;
	}
	void setEmail(String email){
		this.email = email;
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
	String getEmail(){
		return email;
	}
	String getUsername(){
		return username;
	}
}
