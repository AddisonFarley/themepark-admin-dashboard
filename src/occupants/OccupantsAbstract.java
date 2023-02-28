package occupants;

/**
 * This is an abstract class that serves as the blueprint for all occupants of the
 * park.
 *
 * @author Addison Farley
 * @version 1.0
 */
abstract class OccupantsAbstract
{
    private String fullName;
    private String id;

    /**
     * Provides the constructor blueprint for child classes.
     * @param fullName String object of the occupant's full name
     * @param id String object of the occupant's ID
     */
    public OccupantsAbstract(String fullName, String id)
    {
        this.fullName = fullName;
        this.id = id;
    }

    /**
     * Getter for the occupant's full name
     * @return String object of the occupant's full name
     */
    public String getFullName()
    {
        return fullName;
    }

    /**
     * Getter for the occupant's ID
     * @return String object of the occupant's ID
     */
    public String getId()
    {
        return id;
    }

    /**
     * Setter for the occupant's full name
     */
    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    /**
     * Setter for the occupant's ID
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * String representation of the data stored in this object
     * @return String object of all data stored
     */
    @Override
    public String toString()
    {
        return "Name: " + fullName + " (" + id + ")";
    }
}
