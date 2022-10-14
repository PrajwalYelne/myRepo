import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.*;

public class UserDAO{

    public ArrayList<User> listUsers() throws Exception{
    	ArrayList<User> userList = new ArrayList<User>();
    	//fill your code here
      Connection con = DBConnection.getConnection();
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery("select * from \"user\"");
	//   SimpleDateFormat sdf = new SimpleDateFormat("dd-MON-YYYY");
      while(rs.next()) {
      userList.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7),rs.getString(8)));
      }
      return userList;
    }
    public void deleteUser(Integer id) throws Exception{
    	//fill your code here
        Connection con = DBConnection.getConnection();
      Statement st = con.createStatement();
       int updateCount=st.executeUpdate("delete from  \"user\" where id ="+id);

    }
    
}
