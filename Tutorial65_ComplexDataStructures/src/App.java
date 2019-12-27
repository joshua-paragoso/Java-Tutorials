import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
//using complex data structures with complex data
//define classes to hold this data before defining structures

public class App {

	//1D array
    public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

    //2D array
    //these are all ordered list
    public static String[][] drivers = { 
    	//these people operate ambulance
        { "Fred", "Sue", "Pete" },
        //these people operate helicopter
        { "Sue", "Richard", "Bob", "Fred" }, 
        //these people operate lifeboats
        { "Pete", "Mary", "Bob" },
        };

    public static void main(String[] args) {
    	
    	//using map
    	//no need sorted, we dont care for order
    	//we can use a HashMap since we dont care for order
    	//First parameter is for the type of vehcile
    	//second parameter is for driver
        Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

        //iterate through each vehicle 
        for (int i = 0; i < vehicles.length; i++) {
        	//getting the vehicle
            String vehicle = vehicles[i];
            //getting the driver
            String[] driversList = drivers[i];

            //removes duplicates just in case
            Set<String> driverSet = new LinkedHashSet<String>();

            //iterator through list of drivers to add to driver set
            for (String driver : driversList) {
                driverSet.add(driver);
            }

            //puts data into the HashMap
            personnel.put(vehicle, driverSet);
        }

        { // Brackets just to scope driversList variable so can use again later
            // Example usage
        	//creates a new set that gets the whole personel of that vehicle
            Set<String> driversList = personnel.get("helicopter");
            
            //prints out the drivers list of the vehicle
            for (String driver : driversList) {
                System.out.println(driver);
            }
        }

        // Iterate through whole thing (iterate through complex data type)
        for (String vehicle : personnel.keySet()) {
            System.out.print(vehicle);
            System.out.print(": ");
            //drivers list of the particular vehcile
            Set<String> driversList = personnel.get(vehicle);

            //prints out the entire drivers list of that vehicle
            for (String driver : driversList) {
                System.out.print(driver);
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }

}

 