package T3;

public interface BidCollectionInterface {

    /**Adds a bid to this collection.
     * Precondition: None.
     * Postcondition: The bid was added at the end of the collection.
     * @param toAdd The bid to add.*/
    public void add (BidInterface toAdd);

    /**Returns the bid in this collection with the best yearly cost.
     * Precondition: The collection is not empty.
     * Postcondition: The bid with the lowest yearly was returned.
     * @para averageHours Average hours of operation per year.
     * @param energyCost Cost in dollar per kilowatt hour.
     * @return A bid with the lowest yearly cost.*/
    public BidInterface bestYearlyCost(double averageHours, double energyCost);

    /**Returns the bid in this collection with the best initial cost.
     The initial cost will be defined as the unit cost plus the installation cost.
     * Precondition: The collection is not empty.
     * Postcondition: The bid with the lowest initial cost was returned.
     * @return A bid with the lowest initial cost.*/
    public BidInterface bestInitialCost();

    /**Clears all of the items from this collection.
     * Precondition: None
     * Postcondition: The collection is empty.*/
    public void clear();

    /**Gets the number of items in this collection.
     * Precondition: None.
     * Postcondition: The collections is unchanged.*/
    public int getLength();

    /**Sees whether this collection is empty
     * Precondition: None
     * Postcondition: The collection is unchanged.
     * @return True if there are no items in the bid collection, false otherwise. */
    public boolean isEmpty();

} //end BidCollectionInterface
