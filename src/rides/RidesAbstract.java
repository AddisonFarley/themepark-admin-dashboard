package rides;

/**
 * This is an abstract class that serves as the blueprint for all rides in the
 * park.
 *
 * @author Addison Farley
 * @version 1.0
 */
abstract class RidesAbstract
{
    private String title;
    private int runningTime;

    /**
     * Provides the constructor blueprint for child classes.
     * @param title String object of the ride's title
     * @param runningTime int object of the ride's running time
     */
    public RidesAbstract(String title, int runningTime)
    {
        this.title = title;
        this.runningTime = runningTime;
    }

    /**
     * Getter for the ride's title
     * @return String object of the ride's title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Getter for the ride's running time
     * @return int object of the ride's running time
     */
    public int getRunningTime()
    {
        return runningTime;
    }

    /**
     * Setter for the ride's title
     * @param title String object of the ride's title
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * Setter for the ride's running time
     */
    public void setRunningTime(int runningTime)
    {
        this.runningTime = runningTime;
    }

    /**
     * String representation of the data stored in this object
     * @return String object of all data stored
     */
    @Override
    public String toString()
    {
        return "Title: " + title + "\nRunning time: " + runningTime + " mins";
    }
}
