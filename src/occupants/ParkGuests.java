package occupants;

import java.time.LocalDate;

/**
 * This class represents the park guests and the unique data needed
 * for the park admin dashboard to properly track it.
 *
 * @author Addison Farley
 * @version 1.0
 */
public class ParkGuests extends OccupantsAbstract
{
    private LocalDate lastVisited;
    private boolean annualPassHolder;

    /**
     * Creates a parkGuests object
     * @param fullName String object of the guest's full name
     * @param id String object of the guest's ID
     * @param lastVisited LocalDate object of the guest's date of last visit
     * @param annualPassHolder boolean object of the status of the guest's annual pass
     */
    public ParkGuests(String fullName, String id,
                      LocalDate lastVisited, boolean annualPassHolder)
    {
        super(fullName, id);
        this.lastVisited = lastVisited;
        this.annualPassHolder = annualPassHolder;
    }

    /**
     * Getter for the guest's last date of visit
     * @return LocalDate object lastVisited
     */
    public LocalDate getLastVisited()
    {
        return lastVisited;
    }

    /**
     * Getter for the status of the guest being an annual pass holder
     * @return return yes if true, no if false
     */
    public String isAnnualPassHolder()
    {
        if(annualPassHolder)
        {
            return "yes";
        }
        return "no";
    }

    /**
     * Setter for date of last visit
     * @param lastVisited LocalDate object lastVisited
     */
    public void setLastVisited(LocalDate lastVisited)
    {
        this.lastVisited = lastVisited;
    }

    /**
     * Setter for the status of the guest's annual pass
     * @param annualPassHolder boolean object of the status of the guest's annual pass
     */
    public void setAnnualPassHolder(boolean annualPassHolder)
    {
        this.annualPassHolder = annualPassHolder;
    }

    /**
     * String representation of the data stored in this object
     * @return String object of all data stored
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nLast Visited: " + lastVisited + "\nAnnual Pass Holder: " + isAnnualPassHolder();
    }
}
