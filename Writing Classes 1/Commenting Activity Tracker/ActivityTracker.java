public class ActivityTracker
{
    public static void main(String[] args)
    {
        // Creating an object called mylog//
        
        ActivityLog mylog = new ActivityLog();
        // using addMiles from the ActivityLog class to give the object a value for miles
        mylog.addMiles(5);
        // using addHours from the ActivityLog class to give the object a value for hours 
        mylog.addHours(1);
        
        //Printing the total of miles
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        // Storing those values on hoursToday which is a double
        double hoursToday = mylog.getHours();
        // using addHours from the ActivityLog class to give the object a different value for hours 
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        //Storing on double increase the difference of the new values and the old ones which were store on hoursToday 
        double increase = mylog.getHours() - hoursToday;
        // Print the difference of them 
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}