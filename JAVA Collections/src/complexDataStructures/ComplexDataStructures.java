package complexDataStructures;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructures {

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "Fred", "Sue", "Pete" },
			{ "Sue", "Richard", "Bob", "Fred" }, { "Pete", "mary", "Bob" } };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// We use Map Because we can user Vechicles as Key and drivers as values
		// For Map values we use Set because ,there is no need of duplication
		Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

		// vehicles and drivers co-relation
		// Here we use vehicles as index
		for (int i = 0; i < vehicles.length; i++) {

			String vehicle = vehicles[i];
			String[] driverslist = drivers[i];

			Set<String> driverSet = new LinkedHashSet<String>();

			// System.out.println("List of Drivers :");
			for (String driver : driverslist) {

				driverSet.add(driver);
				// System.out.println(driver);

			}

			personnel.put(vehicle, driverSet);

		}

		{
			// {} Brackets just to scope driverList variable inside them,so we
			// can use again later
			// Example Usage
			// get(key) using the key,it will return values
			Set<String> driverList = personnel.get("helicopter");
			System.out.println("Drivers for helicopter are:");
			for (String driver : driverList) {
				System.out.println(driver);
			}
		}
		// Iterate through whole thing
		for (String vehicle : personnel.keySet()) {

			System.out.print(vehicle);
			System.out.print(":");

			Set<String> driverList = personnel.get(vehicle);

			for (String driver : driverList) {
				System.out.print(driver);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
