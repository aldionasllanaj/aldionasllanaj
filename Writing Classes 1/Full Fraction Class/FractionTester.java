public class FractionTester
{
    public static void main(String[] args)
    {
        // Implement the Fraction class in Fraction.java
        // Then add code here to test out your Fraction class!
Fraction first = new Fraction(1, 2);
Fraction second = new Fraction(1, 3);
System.out.println();

System.out.println("BEFORE:");
System.out.println("first: " + first);
System.out.println("second: " + second);

first.multiply(second);

System.out.println("AFTER:");

System.out.println("first: " + first);
System.out.println("second: " + second);
    }
}