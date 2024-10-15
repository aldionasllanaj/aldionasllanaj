public class ActivityLog
{
    //instance variables for ActivityLog object
    private double numHours;
    private double numMiles;
    
    /**
    Stores a value for numHours and numMiles of a given ActivityLog object.
    Precondition: ActivityLog object must be initialized.
    Postcondition: double numHours and numMiles equal to 0
    
    @param numHours -the new value of hours to be set for ActivityLog object
    @param numMiles -the new value of miles to be set for ActivityLog object

    */
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    /**
     * Increase hours in log by given amount
     * @param hours the amount of hours to add
     */
    public void addHours(double hours)
    {
        numHours += hours;
    }
    /**
     * Increase miles in log by given amount
     * @param miles the amount of miles to add
     */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    /**
     * Get amount of miles accumulated
     * @return Accumulated miles
     */
    public double getMiles()
    {
        return numMiles;
    }
    /**
     * Get amount of hours accumulated
     * @return Accumulated hours
     */
    public double getHours() 
    {
        return numHours;
    }
    
}