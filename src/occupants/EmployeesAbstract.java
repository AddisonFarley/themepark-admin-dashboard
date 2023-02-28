package occupants;

import java.time.LocalDate;

/**
 * This is an abstract class that serves as the blueprint for all employees of the
 * park. It extends from the OccupantsAbstract class.
 *
 * @author Addison Farley
 * @version 1.0
 */
public abstract class EmployeesAbstract extends OccupantsAbstract
{
    private LocalDate hireDate;

    /**
     * Provides the constructor blueprint for child classes.
     * @param fullName String object of the employee's full name
     * @param id String object of the employee's ID
     * @param hireDate LocalDate object of the employee's date of hire
     */
    public EmployeesAbstract(String fullName, String id, LocalDate hireDate)
    {
        super(fullName, id);
        this.hireDate = hireDate;
    }

    /**
     * Getter for hireDate
     * @return LocalDate object of the date of hire
     */
    public LocalDate getHireDate()
    {
        return hireDate;
    }

    /**
     * Setter for hireDate
     * @param hireDate LocalDate object of the date of hire
     */
    public void setHireDate(LocalDate hireDate)
    {
        this.hireDate = hireDate;
    }

    /**
     * String representation of the data stored in this object
     * @return String object of all data stored
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nHire date: " + hireDate;
    }
}
