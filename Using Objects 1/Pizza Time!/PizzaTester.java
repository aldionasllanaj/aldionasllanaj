public class PizzaTester 
{
    public static void main(String[] args)
    {
        // Test your Pizza class here.
        Pizza piz1 = new Pizza ("Veggie", "Tamatoes, onions, olives", 12);
        Pizza piz2 = new Pizza ("Cheese", "Cheese" , 15);
        Pizza piz3 = new Pizza ("Meat", "Pepperoni, sausage, bacon", 20);
        System.out.println(piz1);
        System.out.println(piz2);
        System.out.println(piz3);
    }
}