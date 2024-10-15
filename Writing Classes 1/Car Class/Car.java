public class Car {

    // Start here
    private double efficiency; // this is miles per gallon
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    
    
    public Car(double carEfficiency, double carTankCapacity){
        efficiency = carEfficiency;
        tankCapacity = carTankCapacity;
        gas = 0;
        totalMilesDriven = 0;
    }
    
    public void addGas(){
        System.out.println("Filling up ...");
        gas = tankCapacity;
    }
    
    public void addGas(double amount){
        gas += amount;
        System.out.println("Adding gas ...");
        if (gas > tankCapacity){
            gas = tankCapacity;
        }
    }
    public double getTotalMilesDriven(){
        return totalMilesDriven;
    }
    public void drive(double distance){
        if (canDrive(distance)){
        totalMilesDriven += distance;
        gas -= distance / efficiency  ;
        System.out.println("Driving " + distance);
        
        }else{
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }
    public boolean canDrive (double distance){
        return gas >= distance / efficiency;
    }
    public double milesAvailable(){
        return efficiency * gas;
    }
    public double getGas(){
        return gas;
    }
}