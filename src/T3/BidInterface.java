package T3;

/**
 * This is an interface for a single bid for installing an air conditioning unit.
 */
public interface BidInterface{
    /**Returns the name of the company making this bid.
     * Precondition: None.
     * Postcondition: The name was returned.
     * @return the name of the company making this bid.*/
    public String getCompanyName();

    /**Returns the description of the air conditioner that this bid is for.
     * Precondition: None.
     * Postcondition: The description was returned.
     * @return The description of the air conditioner.*/
    public String getDescription();

    /**Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     * Precondition: None.
     * Postcondition: The performance was returned.
     * @return The cooling capacity of the AC unit in tons. */
    public double getCapacity();

    /**Returns the seasonal efficiency of this bid's AC (SEER).
     * Precondition: None.
     * Postcondition: The seasonal efficiency was returned.
     * @return The efficiency of the bid's AC.*/
    public double getSEER();

    /**Return the cost of this bid's AC.
     * Precondition: None.
     * Postcondition: The AC cost was returned.
     * @return The cost of the unit in dollars.*/
    public double getUnitCost();

    /**Return the cost of installing this bid's AC.
     * Precondition: None.
     * Postcondition: The installation cost was returned.
     * @return The cost of installation in dollars.*/
    public double getInstallationCost();

    /**Returns the yearly cost of operating this bid's AC.
     * Precondition: None.
     * Postcondition: The yearly cost was returned.
     * @param hoursOperated Average number of hours the unit operates per year.
     * @param energyCost Cost in dollars per kilowatt-hour.
     @return The cost for the year in dollars,
      cost = 12 * tons * energyCost * hoursOperated/SEER. */
    public double getYearlyOperationCost(double hoursOperated, double energyCost);
} // end BidInterface


/**
 * This is an interface for a collection of objects each of which is a Bid for installling an air conditioning unit.
 */

