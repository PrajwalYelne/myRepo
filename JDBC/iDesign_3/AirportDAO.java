import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AirportDAO {
    public void insertAirport(Airport airportIns) throws ClassNotFoundException, SQLException{
         DBConnection connec=new DBConnection();
		Connection con=connec.getConnection();
		Statement statement = con.createStatement();
        String code=airportIns.getIataAirportCode();
        String name=airportIns.getName();
        String city=airportIns.getCity();
        String country=airportIns.getCountry();
        String query1 = "INSERT INTO airport(iata_airport_code,name,city,country_name) VALUES('"+code+"','"+name+"','"+city+"','"+country+"')";
        
		statement.executeUpdate( query1);
        //con.close();

    }
    public ArrayList<Airport> listAirport() throws ClassNotFoundException, SQLException{
         DBConnection connec=new DBConnection();
         ArrayList<Airport> AirportList=new ArrayList<Airport>();
		Connection con=connec.getConnection();
		 Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM airport ");
		  while(rs.next())
      	{	
			 // Integer id=rs.getInt("id");
             String iataAirportCode=rs.getString("iata_airport_code");
			  String name=rs.getString("name");
			  String city=rs.getString("city");
              String country=rs.getString("country_name");
	 


			   Airport obj=new Airport(iataAirportCode,name,city,country);
			  AirportList.add(obj);
              
          }
          con.close();
        
        return AirportList;
    }
  
}
