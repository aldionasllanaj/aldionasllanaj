public class StringTrace
{
    public static void main(String[] args)
    {
        String str1 = null;
        String str2 = new String("Karel");
        String str3 = "Karel";
    
        if (str1 == null)
        {
            str1 = str2;
        }
        // These two are both objects and we can use the "==" 
        //because it is a reference equality where we compare
        //if 2 objects go on the same address
        if (str1 == str2)
        {
            System.out.println("str1 and str2 refer to the same object");
        }
        // This line doesn't print out because we are using "==" 
        // which compares if the object are going on the same address 
        //instead of comparing the value of the objects by using ".equals()"
        if (str2 == str3)
        {
            System.out.println("str2 and str3 refer to the same object");
        }
        //This prints out because we are comparing object's values by using ".equals()"
        if (str1.equals(str2) && str2.equals(str3))
        {
            System.out.println("str1, str2, and str3 are equal");
        }
        //This line doesn't print out because the second condition is returning false 
        //since we are comparing if the addresses of the objects are the same and not their value
        if ((str1 == str2) && (str2 == str3))
        {
            System.out.println("str1, str2, and str3 are the same objects");
            
        }
        
    }
}