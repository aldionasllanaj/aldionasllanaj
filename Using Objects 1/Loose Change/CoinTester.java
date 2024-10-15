public class CoinTester
{
    public static void main(String[] args) {

       // Create your program here
       Coins money = new Coins (3,2,1,4);  
       money.bankCount();
       money.bankValue();
       money.addQuarter();
       money.addQuarter();
       money.addDime();
       money.addPenny();
       money.addPenny();
       money.addPenny();
       money.bankCount();
       money.bankValue();
    }
}