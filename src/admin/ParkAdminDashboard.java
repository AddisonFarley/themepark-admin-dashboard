package admin;
import occupants.*;
import rides.*;
import java.util.Arrays;

/**
 * This is the admin dashboard for the theme park program.
 * It manages and organizes all data used for our theme park
 * program.
 *
 * @author Addison Farley
 * @author Josh Archer
 * @version 1.0
 */
public class ParkAdminDashboard
{
    private String parkTitle;
    private String[] hours;
    private Object[] occupants;
    private Object[] rides;

    /**
     * Creates a new ParkAdminDashboard object.
     *
     * @param parkTitle String title of the park.
     * @param hours String array of the hours of operation.
     * @param occupants Object array of the park occupants.
     * @param rides Object array of the park rides.
     */
    public ParkAdminDashboard(String parkTitle, String[] hours,
                              Object[] occupants, Object[] rides)
    {
        this.parkTitle = parkTitle;
        this.hours = hours;
        this.occupants = occupants;
        this.rides = rides;
    }

    /**
     * Getter for park title.
     * @return The title of the park.
     */
    public String getParkTitle()
    {
        return parkTitle;
    }

    /**
     * Getter for park hours.
     * @return The hours of operation of the park.
     */
    public String[] getHours()
    {
        return hours;
    }

    /**
     * Getter for the park occupants.
     * @return The occupants of the park.
     */
    public Object[] getOccupants()
    {
        return occupants;
    }

    /**
     * Getter for the park rides.
     * @return The rides in the park.
     */
    public Object[] getRides()
    {
        return rides;
    }

    /**
     * Prints the schedule of the park to the console.
     */
    public void printSchedule()
    {
        //print out the park hours
        System.out.println(parkTitle + " Hours of Operation:");
        System.out.println("------------------------");
        for (String hour : hours) {
            System.out.println(hour);
        }
    }

    /**
     * Prints the employees of the park to the console.
     */
    public void printEmployees()
    {
        //print out all employees
        System.out.println("Employees:");
        System.out.println("------------------------");
        for (Object occupant : occupants) {
            if (occupant instanceof EmployeesAbstract) {
                System.out.println("************************");
                System.out.println(occupant);
            }
        }
    }

    /**
     * Prints the guest of the park to the console.
     */
    public void printGuests()
    {
        //print out all guests
        System.out.println("Guests:");
        System.out.println("------------------------");
        for (Object occupant : occupants) {
            if (occupant instanceof ParkGuests) {
                System.out.println("************************");
                System.out.println(occupant);
            }
        }
    }

    /**
     * Prints the rides in the park to the console. Differentiates
     * between coasters and dark rides.
     */
    public void printRides()
    {
        //print out all rides
        System.out.println("Coasters:");
        System.out.println("------------------------");
        for (Object o : rides) {
            if (o instanceof Coasters) {
                System.out.println("************************");
                System.out.println(o);
            }
        }
        System.out.println();
        System.out.println("Dark Rides:");
        System.out.println("------------------------");
        for (Object ride : rides) {
            if (ride instanceof DarkRides) {
                System.out.println("************************");
                System.out.println(ride);
            }
        }
    }

    /**
     * Creates a string of all the data stored in each ParkAdminDashboard object.
     * @return String of all data stored.
     */
    @Override
    public String toString()
    {
        return "Park Title: " + getParkTitle() + "\n\nHours: " + Arrays.toString(getHours()) +
                "\n\nOccupants: " + Arrays.toString(getOccupants()) + "\n\nRides: " + Arrays.toString(getRides());
    }
}
