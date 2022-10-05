// BookDAO.java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDAO {
	public ArrayList<Book> listBooks() throws ClassNotFoundException, SQLException{
    	ArrayList<Book> bookList = new ArrayList<Book>();
		DBConnection connec=new DBConnection();
		Connection con=connec.getConnection();
		 Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM BOOK");
		  while(rs.next())
      	{	
			  Integer id=rs.getInt("id");
			  String title=rs.getString("title");
			  String category=rs.getString("category");
			  String author =rs.getString("author");
			  Double price=rs.getDouble("Price");


			  Book obj=new Book(id,title,category,author,price);
			  bookList.add(obj);
          	//System.out.println(rs.getString("title")+"  "+rs.getString("category")+"  "+rs.getString("author"));  
			  
          
      	}

    	//fill your code here
		return bookList;
    }
}
