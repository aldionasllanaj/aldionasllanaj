public class WebsiteTester
{
    public static void main(String[] args)
    {
        // Start here!
        Website web1 = new Website();
        Website web2 = new Website("goodSchool","edu");
        Website web3 = new Website("codehs","com",1000000);
        System.out.println(web1);
        System.out.println(web2);
        System.out.println(web3);
    }
}