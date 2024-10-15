public class Circle
{
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }

    // Implement getArea using
    // Math.PI and
    // Math.pow
    // Area = pi * r^2
    public double getArea()
    {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
    
    // Implement getSphereVolume using
    // Math.PI and
    // Math.pow
    // Volume = 4/3 * pi * r^3
    public double getSphereVolume()
    {
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        return volume;
    }
    
    
    
}