public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        Distance d1 = new Distance(5.0);
        Distance d2 = new Distance(20.0);
        Distance d3 = new Distance(10.0);
        // Convert one to miles, one to leagues and
        // double one mileage
        d1.toMiles();
        d2.toLeagues();
        d3.doubleMiles();
        // Print out the converted values
        // Use the getter!
        System.out.println(d1.getKilometers() + " km = " + d1.toMiles() + " miles");
        System.out.println(d2.getKilometers() + " km = " + d2.toLeagues() + " leagues");
        System.out.println(d3.getKilometers() + " km (one way) = " + d3.doubleMiles() + "miles (round trip)");
        // Use the getter!
        System.out.println(d1.getKilometers());
    }
}