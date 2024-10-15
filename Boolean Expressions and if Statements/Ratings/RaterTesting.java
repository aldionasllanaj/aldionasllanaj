public class RaterTesting
{
    public static void main(String[] args)
    {
        // Start here!
        Rater company = new Rater ("Vesus", 2);
        company.updateReview();
        System.out.println(company);
        
        company.setRating(5);
        company.updateReview();
        System.out.println(company);
        
        
    }
}