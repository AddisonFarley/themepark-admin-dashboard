package occupants;

import java.time.LocalDate;

/**
 * This class represents a costumed actor and the unique data needed
 * for the park admin dashboard to properly track it.
 *
 * @author Addison Farley
 * @version 1.0
 */
public class CostumedActor extends EmployeesAbstract
{
    private String characterPortrayed;

    /**
     * Creates a CostumedActor object.
     *
     * @param fullName String object of the actor's full name
     * @param id String object of the actor's ID
     * @param hireDate LocalDate object of the actor's date of hire
     * @param characterPortrayed String object of the character the actor portrays
     */
    public CostumedActor(String fullName, String id,
                         LocalDate hireDate, String characterPortrayed)
    {
        super(fullName, id, hireDate);
        this.characterPortrayed = characterPortrayed;
    }

    /**
     * Getter for the character portrayed
     * @return String object of characterPortrayed
     */
    public String getCharacterPortrayed()
    {
        return characterPortrayed;
    }

    /**
     * Setter for character portrayed
     * @param characterPortrayed String object of characterPortrayed
     */
    public void setCharacterPortrayed(String characterPortrayed)
    {
        this.characterPortrayed = characterPortrayed;
    }

    /**
     * String representation of the data stored in this object
     * @return String object of all data stored
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nCharacter Portrayal: " + characterPortrayed;
    }
}
