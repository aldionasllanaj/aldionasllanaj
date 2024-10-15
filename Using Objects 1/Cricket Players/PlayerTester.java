public class PlayerTester
{
    public static void main(String[] args) {
       
       //Start here
       CricketPlayer p1 = new CricketPlayer ("Brian Lara","Albania");
       CricketPlayer p2 = new CricketPlayer ("Fabian Allen");
       
       
       p1.addMatch(9,1);
       p1.addMatch(1,2);
       p1.addMatch(3,1);
       p1.addMatch(1,1);
       
       System.out.println("Brian Lara's Stats: ");
       p1.printRunsScored();
       p1.printBallsBowled();
       System.out.println(p1);
       
       p2.addMatch(3,5);
       p2.addMatch(4,1);
       p2.addMatch(10,12);
       p2.addMatch(2,5);
       System.out.println("Fabian Allen's Stats: ");
       p2.printRunsScored();
       p2.printBallsBowled();
       System.out.println(p2);
    }
}