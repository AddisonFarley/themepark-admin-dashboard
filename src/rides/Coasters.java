package rides;

/**
 * This class represents the park's coasters and the unique data needed
 * for the park admin dashboard to properly track it.
 *
 * @author Addison Farley
 * @version 1.0
 */
public class Coasters extends RidesAbstract
{
    private int trackLength;

    /**
     * Creates a Coasters object
     * @param title String object of the coaster's title
     * @param runningTime int object of the coaster's running time
     * @param trackLength int object of the coaster's track length
     */
    public Coasters(String title, int runningTime, int trackLength)
    {
        super(title, runningTime);
        this.trackLength = trackLength;
    }

    /**
     * Getter for the length of the coaster
     * @return int object of the coaster's track length
     */
    public int getTrackLength()
    {
        return trackLength;
    }

    /**
     * Setter for the length of the coaster
     * @param trackLength int object of the coaster's track length
     */
    public void setTrackLength(int trackLength)
    {
        this.trackLength = trackLength;
    }

    /**
     * String representation of the data stored in this object
     * @return String object of all data stored
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nTrack length: " + trackLength + " feet";
    }
}
