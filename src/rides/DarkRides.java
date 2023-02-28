package rides;

/**
 * This class represents the park's dark rides and the unique data needed
 * for the park admin dashboard to properly track it.
 *
 * @author Addison Farley
 * @version 1.0
 */
public class DarkRides extends RidesAbstract
{
    private boolean trackless;

    /**
     * Creates a DarkRides object
     * @param title String object of the dark ride's title
     * @param runningTime int object of the dark ride's running time
     * @param trackless boolean object of whether the ride is trackless
     */
    public DarkRides (String title, int runningTime, boolean trackless)
    {
        super(title, runningTime);
        this.trackless = trackless;
    }

    /**
     * Getter for the dark ride being trackless
     * @return String of Trackless Ride if true, Tracked Ride if false
     */
    public String isTrackless()
    {
        if(trackless)
        {
            return "Trackless Ride";
        }
        return "Tracked Ride";
    }

    /**
     * Setter for the ride being trackless
     * @param trackless boolean object of whether the ride is trackless
     */
    public void setTrackless(boolean trackless)
    {
        this.trackless = trackless;
    }

    /**
     * String representation of the data stored in this object
     * @return String object of all data stored
     */
    @Override
    public String toString()
    {
        return super.toString() + "\n" + isTrackless();
    }
}
