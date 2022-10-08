import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String countryName,airportCode,airportName,city;
        System.out.println("Enter the Airport Code :");
        ArrayList<Airport> airportlist=new ArrayList<Airport>();
        airportCode = br.readLine();
        System.out.println("Enter the Airport name :");
        airportName = br.readLine();
        System.out.println("Enter the City :");
        city = br.readLine();
	System.out.println("Enter the Country name :");
        countryName = br.readLine();
        Airport new_airport=new Airport(airportCode,airportName,city,countryName);
        AirportDAO obj=new AirportDAO();
        obj.insertAirport(new_airport);
        System.out.format("%-10s %-40s %-10s %s\n","IATA Code","Name","City","Country");

         airportlist=obj.listAirport();
         for(Airport airport:airportlist)
         {
             System.out.format("%-10s %-40s %-10s %s\n",airport.getIataAirportCode(),
             airport.getName(),airport.getCity(),airport.getCountry());
         }

        
    }
}
