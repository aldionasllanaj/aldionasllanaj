public class Fraction
{
    // Create your instance variables and constructor here
    private int num1;
    private int num2;
    
    public Fraction (int number1, int number2){
        num1 = number1;
        num2 = number2;
    }
    
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return num1;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return num2;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        num1 = x;
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        num2 = x;
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        num1 = num1 * other.num2 + other.num1 * num2;
        num2 = num2 * other.num2;
    }
    
    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        num1 = num1 * other.num2 - other.num1 * num2;
        num2 = num2 * other.num2;
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        num1 = num1 *  other.num1;
        num2 = num2 * other.num2;
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return num1 + " / " + num2;
    }
}