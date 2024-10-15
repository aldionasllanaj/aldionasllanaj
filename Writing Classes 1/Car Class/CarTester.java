public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car road1 = new Car (20.0,15.0);
        //Fill up the gas tank
        road1.addGas();
        //Check the miles available
        System.out.println("Miles available: " + road1.milesAvailable());
        //Drive 100 miles
        road1.drive(100.0);
        //Check the miles available
         System.out.println("Miles available: " + road1.milesAvailable());
        //Add 2 gallons to the gas tank
        road1.addGas(2);
        //Check the miles available
        System.out.println("Miles available: " + road1.milesAvailable());
        //Try driving more miles than available by driving 1000 miles
        road1.drive(1000.0);
        //Drive 200 miles
        road1.drive(200.0);
        //Check how much gas you have left
        System.out.println("Gas remaining: " + road1.getGas());
        //Print total miles driven
        System.out.println("Total Miles Driven: " + road1.getTotalMilesDriven());
    }
}