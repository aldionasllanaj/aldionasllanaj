public class SalutationsTester
{
    public static void main(String[] args)
    {
        // Test your class here\
        Salutations greet = new Salutations ("Aldion");
        greet.addressLetter();
        System.out.println();
        greet.signLetter();
        System.out.println();
        greet.addressMemo();
        System.out.println();
        greet.signMemo();
    }
}