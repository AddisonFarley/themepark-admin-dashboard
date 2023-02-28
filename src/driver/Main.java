package driver;
import admin.ParkAdminDashboard;
import rides.*;
import occupants.*;

import java.time.LocalDate;

/**
 * This is the entry point for the theme park admin dashboard
 * program. It highlights the functionality and use of this
 * application.
 *
 * @author Addison Farley
 * @version 1.0
 */
public class Main
{
    /**
     * This starts the program. It creates several object of each available class
     * then instantiates them into a ParkAdminDashboard object. Each of the print methods in
     * ParkAdminDashboard are called on the object to show their functionality.
     *
     * @param args command-line arguments not used.
     */
    public static void main(String[] args)
    {
        //park title
        String parkTitle = "Java World";

        //park hours
        String[] hours = {"M-F: 10AM - 10PM", "Sat-Sun: 8AM - 11PM"};

        //park occupants
        ParkGuests guest1 = new ParkGuests("James Gosling", "G1",
                LocalDate.of(2023, 10, 1), true);
        ParkGuests guest2 = new ParkGuests("Bill Joy", "J1",
                LocalDate.of(2021, 6, 21), false);
        CostumedActor actor1 = new CostumedActor("Stan McNer", "M1",
                LocalDate.of(2019,5,4), "The Java Man");
        CostumedActor actor2 = new CostumedActor("Gale Boetticher", "B1",
                LocalDate.of(2016,2,14), "Crystal Blue Scientist");
        FoodVendor vendor1 = new FoodVendor("Jerry Baldwin", "B2",
                LocalDate.of(2022, 2, 28), "Starbucks");
        FoodVendor vendor2 = new FoodVendor("Jennifer Whitmore", "W1",
                LocalDate.of(2014, 11, 2), "BigFoot Java");

        //park rides
        DarkRides darkRides1 = new DarkRides("The Wonders of Java", 3, false);
        DarkRides darkRides2 = new DarkRides("It's a Coffee World After All", 5, true);
        Coasters coasters1 = new Coasters("The Coldest Brew", 2, 4680);
        Coasters coasters2 = new Coasters("Foam Everywhere", 4, 2620);

        //arrays
        Object[] occupants = {guest1, guest2, actor1, actor2, vendor1, vendor2};
        Object[] rides = {darkRides1, darkRides2, coasters1, coasters2};

        //admin dashboard
        ParkAdminDashboard dashboard = new ParkAdminDashboard(parkTitle, hours, occupants, rides);
//        System.out.println(dashboard);
        dashboard.printSchedule();
        System.out.println();
        dashboard.printGuests();
        System.out.println();
        dashboard.printEmployees();
        System.out.println();
        dashboard.printRides();
    }
}
