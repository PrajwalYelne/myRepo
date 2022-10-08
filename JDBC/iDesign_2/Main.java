import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         ArrayList<TravelClass> travelclass_list=new ArrayList<TravelClass>();
        System.out.println("Enter the name of TravelClass :");
        String name = br.readLine();
        System.out.println("Enter the description to update :");
        String description = br.readLine();
        TravelClassDAO obj=new TravelClassDAO();
       obj.updateDetail(name,description);
        travelclass_list=obj.listAllTravelClassess();
        
        System.out.println("Updated List of Travel Classes");
        System.out.format("%-25s %s\n","Name","Description");
        for(TravelClass travelclass:travelclass_list)
        {
         System.out.format("%-25s %s\n",travelclass.getName(),travelclass.getDescription());
        }

 
    }
}
