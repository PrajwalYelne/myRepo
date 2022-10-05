// DBConnection.java
import java.sql.*;
import java.util.ResourceBundle;
public class DBConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {        
        ResourceBundle rb = ResourceBundle.getBundle("oracle");
        String url = rb.getString("db.url");
        String username = rb.getString("db.username");
        String password = rb.getString("db.password");
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection(url, username, password);
        //Statement statement = con.createStatement();
        //ResultSet rs = statement.executeQuery("SELECT * FROM BOOK");
		return con;
         

        //fill your code here
    }
}
