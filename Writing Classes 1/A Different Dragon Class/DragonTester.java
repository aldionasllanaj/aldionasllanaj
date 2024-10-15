public class DragonTester
{
    public static void main(String[] args)
    {
        // Start here!
        Dragon drag1 = new Dragon ("Name",7);
        System.out.println(drag1.getName());
        System.out.println(drag1.getLevel());
       System.out.println(drag1.isFireBreather());
       drag1.gainExperience();
       drag1.attack();
    }
}