public class FallingBodies
{
    public static void main(String[] args)
    {
        // Start here!
        double g = 9.8;
        double t = 23;
        double h = 0.5 * g * t *t;
        double v = g* t;
        System.out.println("The height is " + h + " meters." );
        System.out.print("The velocity of the pebble when it hits the ground is " + v + " m/s");
    }
}