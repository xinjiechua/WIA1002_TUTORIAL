package T3;

public class Q2 {
}

interface BidInterface{
    /**Returns the name of the company making this bid.
     * Precondition: None
     * Postcondition: The name was returned
     * @return the name of the company making this bid.
     */
    public String getCompanyName();

    /**Returns the description of the air conditioner that this bid is for.
     * Precondition: None
     * Postcondition: The description of the air conditioner was returned
     * @return the description of the air conditioner that this bid is for.
     */
    public String getDescription();

    /**Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU)
     * Precondition: None
     * Postcondition: The capacity of this bid's AC in tons was returned
     * @return the capacity of this bid's AC in tons.
     */
    public double getCapacity();

    /**Returns the seasonal efficiency of this bid's AC (SEER)
     * Precondition: None
     * Postcondition: The seasonal efficiency was returned
     * @return the seasonal efficiency of this bid's AC
     */
    public double getSEER();

    /**Return the cost of this bid's AC
     * Precondition: None
     * Postcondition: The cost was returned
     * @return the cost of this bid's AC
     */
    public double getCost();

    /**Return the cost of installing this bid's AC
     * Precondition: None
     * Postcondition: The installation cost was returned
     * @return the cost of installing this bid's AC
     */
    public double getInstallationCost();

    /**Return the yearly cost of operating this bid's AC
     * Precondition: None
     * Postcondition: The yearly operation cost was returned
     * @param operationHours Average number of unit operates per year.
     * @param energyFee Cost per kilowatt hour.
     @return The cost for this AC, cost=12*tons**energyFee*operationHours/SEER.
     */
    public double getYearlyOperationCost(double operationHours, double energyFee);

}

interface BidCollectionInterface <E extends BidInterface>{

    /**Adds a bid to this collection
     * Precondition: None
     * Postcondition: The bid was added into the collection
     * @param bid The bid to be added
     */
    public void addBid (E bid);

    /**Returns the bid in this collection with the best yearly cost.
     * Precondition: The collection cannot be empty.
     * Postcondition: The bid with best yearly cost will be returned.
     * @param operationHours Average number of unit operates per year.
     * @param energyFee Cost per kilowatt hour.
     * @return The bid with lowest yearly cost.
     */
    public E bestYearlyCostBid(double operationHours, double energyFee);

    /**Returns the bid in this collection with the best initial cost. The initial cost will be defined as
     the
     unit cost plus the installation cost.
     * Precondition: The collection cannot be empty.
     * Postcondition: The bid with best initial cost will be returned.
     * @param bidCollection The collection of bids.
     * @return The bid with the lowest initial cost.
     */
    public E bestInitialCost(BidInterface bidCollection);

    /**Clears all items from this collection.
     * Precondition: The collection cannot be empty.
     * Postcondition: The collection is empty.
     */
    public void clear();

    /**Gets the number of items in this collection.
     * Precondition: The collection cannot be empty.
     * Postcondition: The number of items in this collection will be returned.
     * @param bidCollection The collection of bids
     * @return number of items.
     */
    public int numberOfItems(BidInterface bidCollection);

    /**Sees whether this collection is empty
     * Precondition: None
     * Postcondition: The collection is unchanged.
     */
    public boolean isEmpty();

}
