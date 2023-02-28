package occupants;

import java.time.LocalDate;

/**
 * This class represents a food vendor and the unique data needed
 * for the park admin dashboard to properly track it.
 *
 * @author Addison Farley
 * @version 1.0
 */
public class FoodVendor extends EmployeesAbstract
{
    private String foodStallAssignment;

    /**
     * Creates a food vendor object.
     *
     * @param fullName String object of the vendor's full name
     * @param id String object of the vendor's ID
     * @param hireDate LocalDate object of the vendor's date of hire
     * @param foodStallAssignment String object of the vendor's food stall
     */
    public FoodVendor(String fullName, String id,
                      LocalDate hireDate, String foodStallAssignment)
    {
        super(fullName, id, hireDate);
        this.foodStallAssignment = foodStallAssignment;
    }

    /**
     * Getter for the vendor's food stall assignment
     * @return String object of foodStallAssignment
     */
    public String getFoodStallAssignment()
    {
        return foodStallAssignment;
    }

    /**
     * Setter for the vendor's food stall assignment
     * @param foodStallAssignment String object of foodStallAssignment
     */
    public void setFoodStallAssignment(String foodStallAssignment)
    {
        this.foodStallAssignment = foodStallAssignment;
    }

    /**
     * String representation of the data stored in this object
     * @return String object of all data stored
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nServes At: " + foodStallAssignment;
    }
}
